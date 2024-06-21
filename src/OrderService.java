public class OrderService {
  public void makeOrder(ShoppingCart s) {
    // check the product availability
    for (OrderItem i : s.getItems()) {
      Inventory ivt = Inventory.getByProductId(i.getItem().getId());
      if (ivt.getQuantity() < i.getQuantity()) {
        throw new RuntimeException("Insuficient inventory for the item " + i.getItem().getName());
      }
    }

    // calculating the order total
    Double t = 0.0;
    for (OrderItem i : s.getItems()) {
      t += i.getQuantity() * i.getItem().getPrice();
    }

    // make order
    Order o = new Order();
    o.setTaxes(t * 12);
    o.setTotal(t);
    o.save();

    // generate invoice
    Invoice iv = new Invoice();
    iv.setItems(s.getItems());
    iv.save();

    // inventory adjustment
    for (OrderItem i : s.getItems()) {
      Inventory i = Inventory.getByProductId(i.getItem().getId());
      i.setQuantity(i.getQuantity() - iv.getQuantity());
      i.save();
    }
  }
}
