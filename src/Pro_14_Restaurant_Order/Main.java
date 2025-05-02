
//Problem 14: Restaurant Order System (Deque, List)
//        Use a Deque<Order> for managing current orders.
//        •	Allow adding/removing orders from both ends.
//        •	Store history in a List<Order>.


package Pro_14_Restaurant_Order;

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        RestaurantOrderSystem manager = new RestaurantOrderSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Restaurant Order System ---");
            System.out.println("1. Add Order to Front");
            System.out.println("2. Add Order to Back");
            System.out.println("3. Remove Order from Front");
            System.out.println("4. Remove Order from Back");
            System.out.println("5. Show Current Orders");
            System.out.println("6. Show Order History");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            if (ch == 1) {
                System.out.print("Enter Order ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Item Name: ");
                String name = sc.nextLine();
                Order order = new Order(id, name);
                manager.addOrderToFront(order);
            }
            else if (ch == 2) {
                System.out.print("Enter Order ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Item Name: ");
                String name = sc.nextLine();

                Order order = new Order(id, name);
                manager.addOrderToBack(order);
            }
            else if (ch == 3) {
                manager.removeOrderFromFront();
            }
            else if (ch == 4) {
                manager.removeOrderFromBack();
            }
            else if (ch == 5) {
                manager.printCurrentOrders();
            }
            else if (ch == 6) {
                manager.printOrderHistory();
            }
            else if (ch == 7) {
                System.out.println("Thank you For Coming , Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid choice, try again.");
            }
        }

        sc.close();
    }
}
