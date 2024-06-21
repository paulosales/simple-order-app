public class Inventory {
  private Product product;
  private Double quantity;

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public static Inventory getByProductId(Long productId) {
    //query from the DB
    return new Inventory();
  }
}