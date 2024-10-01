package Adapter_design_pattern;

import java.util.Scanner;

public class AdapterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose WebDriver to use: ");
        System.out.println("1: ChromeDriver");
        System.out.println("2: IEDriver");
        int choice = scanner.nextInt();

        WebDriver webDriver;

        switch (choice) {
            case 1:
                webDriver = new ChromeDriver();
                break;
            case 2:
                IEDriver ieDriver = new IEDriver();
                webDriver = new WebDriverAdapter(ieDriver);
                break;
            default:
                System.out.println("Invalid choice, defaulting to ChromeDriver");
                webDriver = new ChromeDriver();
                break;
        }

        webDriver.getElement();
        webDriver.selectElement();

        scanner.close();
    }
}
