
public class OrderItem {
  private Product item;
  private Double quantity;

  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Product getItem() {
    return item;
  }

  public void setItem(Product item) {
    this.item = item;
  }
}