package myApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BC bc = new BC();
        Menu m = new Menu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world");

        while (true) {

            m.show();

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        bc.turnOn();
                        break;
                    case 2:
                        bc.listAvailable();
                        break;
                    case 3:
                        System.out.print("Enter device name to pair: ");
                        // String device = scanner.nextLine();
                        bc.pair(bc.getOtherDeviceName());
                        break;
                    case 4:
                        bc.connect(bc.getOtherDeviceName());
                        break;
                    case 5:
                        bc.disconnect(bc.getOtherDeviceName());
                        break;
                    case 6:
                        bc.unpair(bc.getOtherDeviceName());
                        break;
                    case 7:
                        bc.turnOff();
                        break;
                    case 0:
                        System.out.println("Exiting Bluetooth Manager...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid Option. Try again.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }

        // bc.turnOn();
        // bc.listAvailable();
        // bc.pair("To other devideName");
        // bc.connect("To other devideName");

        // bc.turnOff();

    }
}
