package factory_design_pattern;

import java.util.Scanner;

public class MusicFactoryPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;  // Control variable to keep the program running

        while (running) {
            System.out.println("Enter the type of instrument you want to play (Guitar/Piano/Drums), or 'exit' to quit:");
            String instrumentType = scanner.nextLine().trim();

            // Check for exit command to stop the loop
            if (instrumentType.equalsIgnoreCase("exit")) {
                running = false; // Set running to false to exit the loop
            } else {
                // Use factory to create the instrument instance
                Instrument instrument = InstrumentFactory.getInstrument(instrumentType);

                // If the instrument type is valid, play the instrument, else show an error message
                if (instrument != null) {
                    instrument.play();
                } else {
                    System.out.println("Invalid instrument type entered. Please enter Guitar, Piano, or Drums.");
                }
            }
        }

        // Close the scanner resource before exiting
        scanner.close();
    }
}
