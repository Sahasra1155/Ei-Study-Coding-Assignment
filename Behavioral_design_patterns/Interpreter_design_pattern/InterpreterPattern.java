package Interpreter_design_pattern;

import java.util.Scanner;

public class InterpreterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Setting up the voice command system
            VoiceInputPlan v1 = new VoiceInput("drive");
            VoiceInputPlan v2 = new VoiceInput("startCar");
            OrVoice driveCommand = new OrVoice(v1, v2);

            VoiceInputPlan v3 = new VoiceInput("fuelcheck");
            VoiceInputPlan v4 = new VoiceInput("doorclosed");
            AndVoice securityCommand = new AndVoice(v3, v4);

            while (true) {
                System.out.println("\nEnter a command to interpret (or type 'exit' to quit):");
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println("\nChoose the type of interpretation:");
                System.out.println("1: OR Interpretation (e.g., 'drive' OR 'startCar')");
                System.out.println("2: AND Interpretation (e.g., 'fuelcheck' AND 'doorclosed')");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        driveCommand.interpret(userInput);
                        break;
                    case 2:
                        securityCommand.interpret(userInput);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            }
        } catch (Exception e) {
            System.out.println(e + " :set the debugger chain correctly");
        } finally {
            scanner.close();
        }
    }
}
