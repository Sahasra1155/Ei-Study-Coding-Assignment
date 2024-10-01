package builder_design_pattern;

import java.util.Scanner;

public class BuilderPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the first vehicle (Car)
        System.out.println("Enter details for the car:");
        System.out.print("Engine: ");
        String carEngine = scanner.nextLine();
        System.out.print("Number of wheels: ");
        int carWheels = scanner.nextInt();
        System.out.print("Number of airbags: ");
        int carAirbags = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Vehicle car = new Vehicle.VehicleBuilder(carEngine, carWheels)
                .setAirbags(carAirbags)
                .build();

        // Taking user input for the second vehicle (Bike)
        System.out.println("\nEnter details for the bike:");
        System.out.print("Engine: ");
        String bikeEngine = scanner.nextLine();
        System.out.print("Number of wheels: ");
        int bikeWheels = scanner.nextInt();

        Vehicle bike = new Vehicle.VehicleBuilder(bikeEngine, bikeWheels).build();

        // Display vehicle details
        System.out.println("\nCar Details:");
        System.out.println("Engine: " + car.getEngine());
        System.out.println("Wheels: " + car.getWheel());
        System.out.println("Airbags: " + car.getAirbags());

        System.out.println("\nBike Details:");
        System.out.println("Engine: " + bike.getEngine());
        System.out.println("Wheels: " + bike.getWheel());
        System.out.println("Airbags: " + (bike.getAirbags() == 0 ? "Not Available" : bike.getAirbags()));
        
        scanner.close();
    }
}

