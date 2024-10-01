package bridge_design_pattern;

import java.util.Scanner;

public class BridgePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select TV Brand:");
        System.out.println("1: Sony");
        System.out.println("2: Philips");
        int tvChoice = scanner.nextInt();

        System.out.println("Select Remote Type:");
        System.out.println("1: Old Remote");
        System.out.println("2: New Remote");
        int remoteChoice = scanner.nextInt();

        Remote remote = null;
        switch (remoteChoice) {
            case 1:
                remote = new OldRemote();
                break;
            case 2:
                remote = new NewRemote();
                break;
            default:
                System.out.println("Invalid choice for remote. Defaulting to Old Remote.");
                remote = new OldRemote();
        }

        TV tv = null;
        switch (tvChoice) {
            case 1:
                tv = new Sony(remote);
                break;
            case 2:
                tv = new Philips(remote);
                break;
            default:
                System.out.println("Invalid choice for TV. Defaulting to Sony.");
                tv = new Sony(remote);
        }

        tv.on();
        tv.off();

        scanner.close();
    }
}
