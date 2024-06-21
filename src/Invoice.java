import java.util.List;

public class Invoice {
  private List<OrderItem> items;

  public List<OrderItem> getItems() {
    return items;
  }

  public void setItems(List<OrderItem> items) {
    this.items = items;
  }

  public void save() {
    //persits into DB...
    return;
  }
}