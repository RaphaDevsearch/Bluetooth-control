package myApp;

public class Menu {
    private int choose;

    public Menu() {
    }

    public void show() {
        System.out.println("\n===== Bluetooth Manager =====");
        System.out.println("1. Turn ON Bluetooth");
        System.out.println("2. Scan for devices");
        System.out.println("3. Pair with device");
        System.out.println("4. Connect to device");
        System.out.println("5. Disconnect from device");
        System.out.println("6. Unpair device");
        System.out.println("7. Turn OFF Bluetooth");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
        System.out.print("Choose an option: ");
    }

    public int getChoose() {
        return this.choose;
    }

    public void choose(int yourChoose) {

        this.choose = yourChoose;

    }

}
