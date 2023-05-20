import com.resturant.potato.Orders;
import com.resturant.potato.PotatoResturant;

public class Main {
    public static void main(String[] args) {

        PotatoResturant resturnat = new PotatoResturant();

        Orders order = new Orders();
        order.name = "order1";
        order.quantity = 20;


        Orders order1 = new Orders();
        order.name = "order2";
        order.quantity = 2;

        Orders order2 = new Orders();
        order.name = "order2";
        order.quantity = 10;

        Orders order3 = new Orders();
        order.name = "order3";
        order.quantity = 23;

        Orders order4 = new Orders();
        order.name = "order4";
        order.quantity = 21;

        resturnat.addOrder(order, order1, order2, order3, order4);

        System.out.println(resturnat.orders.length);
        resturnat.serve();
        resturnat.serve();
        resturnat.serve();

    }
}