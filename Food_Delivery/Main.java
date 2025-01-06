import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> restaurants = new HashMap<>();
        Map<String, Integer> menuPrices = new HashMap<>();
        List<String> orderHistory = new ArrayList<>();
        
        restaurants.put("Foodies Paradise", Arrays.asList("Idli", "Dosa", "Vada"));
        restaurants.put("Healthy Eats", Arrays.asList("Rasam Rice", "Vegetable Upma", "Curd Rice"));
        restaurants.put("Desi Delights", Arrays.asList("Chicken Chettinad", "Mutton Sukka", "Parotta"));

        menuPrices.put("Pizza", 200);
        menuPrices.put("Burger", 100);
        menuPrices.put("Pasta", 150);
        menuPrices.put("Salad", 120);
        menuPrices.put("Smoothie", 80);
        menuPrices.put("Quinoa Bowl", 200);
        menuPrices.put("Biryani", 250);
        menuPrices.put("Paneer Butter Masala", 300);
        menuPrices.put("Naan", 50);

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to Zomato Delivery App!");
            System.out.println("1. View Restaurants");
            System.out.println("2. View Menu and Place Order");
            System.out.println("3. View Order History");
            System.out.println("4. Track Order");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Restaurants:");
                    for (String restaurant : restaurants.keySet()) {
                        System.out.println("- " + restaurant);
                    }
                    break;
                case 2:
                    System.out.println("\nSelect a restaurant to view its menu:");
                    int index = 1;
                    List<String> restaurantList = new ArrayList<>(restaurants.keySet());

                    for (String restaurant : restaurantList) {
                        System.out.println(index + ". " + restaurant);
                        index++;
                    }

                    System.out.print("Enter your choice: ");
                    int restaurantChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (restaurantChoice < 1 || restaurantChoice > restaurantList.size()) {
                        System.out.println("Invalid choice. Returning to main menu.");
                        break;
                    }

                    String selectedRestaurant = restaurantList.get(restaurantChoice - 1);
                    System.out.println("\nMenu for " + selectedRestaurant + ":");
                    List<String> menu = restaurants.get(selectedRestaurant);

                    for (String item : menu) {
                        System.out.println("- " + item + " (Rs. " + menuPrices.get(item) + ")");
                    }

                    System.out.print("Enter the name of the item you want to order: ");
                    String orderItem = scanner.nextLine();

                    if (menu.contains(orderItem)) {
                        orderHistory.add(orderItem);
                        System.out.println("\nOrder placed for " + orderItem + ". Thank you!");
                    } else {
                        System.out.println("\nItem not available in the menu. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("\nOrder History:");
                    if (orderHistory.isEmpty()) {
                        System.out.println("No orders placed yet.");
                    } else {
                        for (int i = 0; i < orderHistory.size(); i++) {
                            System.out.println((i + 1) + ". " + orderHistory.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nTrack Order:");
                    if (orderHistory.isEmpty()) {
                        System.out.println("No orders to track.");
                    } else {
                        System.out.println("Your order is being prepared and will be delivered shortly.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using Zomato Delivery App. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
