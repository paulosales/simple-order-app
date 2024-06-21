import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    List<OrderItem> items = new ArrayList<>();
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.setItems(items);
    OrderService orderService = new OrderService();
    orderService.makeOrder(shoppingCart);
  }
}