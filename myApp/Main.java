package myApp;

public class Main {
    public static void main(String[] args) {
        BC bc = new BC();
        Menu m = new Menu();
        System.out.println("Hello world");
        

        while (true) {
            m.show();
            m.choose(); // we have to set it before
            switch (m.getChoose()) {
                case 1:
                    bc.turnOn();
                    break;
                case 3:
                    bc.listAvailable();
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;
            }
            if (m.getChoose()== 3) {
                break;
            }
        }

        // bc.turnOn();
        // bc.listAvailable();
        // bc.pair("To other devideName");
        // bc.connect("To other devideName");

        // bc.turnOff();
    }
}
