package myApp;

public class Menu {
    public Menu() {
    }

    public void show() {
        System.out.println("\n=== Bluetooth Manager ===");
        System.out.println("1. Turn Bluetooth ON");
        System.out.println("2. Turn Bluetooth OFF");
        System.out.println("3. List Available Devices");
        System.out.println("4. Pair with Device");
        System.out.println("5. Unpair Device");
        System.out.println("6. Connect to Device");
        System.out.println("7. Disconnect Device");
        System.out.println("8. Check if Device is Paired");
        System.out.println("9. Check if Device is Connected");
        System.out.println("10. Show Bluetooth Status");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
}
