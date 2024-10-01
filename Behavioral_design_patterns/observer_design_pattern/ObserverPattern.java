package observer_design_pattern;

import java.util.Scanner;

public class ObserverPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryData deliveryData = new DeliveryData();

        Observer seller = new Seller();
        Observer user = new User();
        Observer warehouse = new DeliveryWarehouseCenter();

        System.out.println("Do you want to register Seller? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            deliveryData.register(seller);
        }

        System.out.println("Do you want to register User? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            deliveryData.register(user);
        }

        System.out.println("Do you want to register Warehouse? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            deliveryData.register(warehouse);
        }

        System.out.println("\nLocation update - notifying observers:");
        deliveryData.locationChanged();

        System.out.println("\nDo you want to unregister Warehouse? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            deliveryData.unregister(warehouse);
        }

        System.out.println("\nLocation update after unregistering Warehouse - notifying observers:");
        deliveryData.locationChanged();

        scanner.close();
    }
}
