import java.util.Scanner;

public class SatelliteCommandSystem {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        CommandInvoker invoker = new CommandInvoker();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Satellite Command System!");
        System.out.println("Available commands: rotate <direction>, activatePanels, deactivatePanels, collectData, exit");

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().trim();
            String[] commandParts = input.split(" ");

            try {
                switch (commandParts[0]) {
                    case "rotate":
                        if (commandParts.length < 2) throw new IllegalArgumentException("Direction not provided.");
                        invoker.executeCommand(new RotateCommand(satellite, commandParts[1]));
                        break;
                    case "activatePanels":
                        invoker.executeCommand(new ActivatePanelsCommand(satellite));
                        break;
                    case "deactivatePanels":
                        satellite.deactivatePanels();
                        break;
                    case "collectData":
                        invoker.executeCommand(new CollectDataCommand(satellite));
                        break;
                    case "exit":
                        System.out.println("Exiting the system.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Unknown command. Please try again.");
                }
                System.out.println(satellite);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
