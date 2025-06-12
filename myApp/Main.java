package myApp;

public class Main {
    public static void main(String[] args) {
        BC bc = new BC();
        Menu m = new Menu();
        System.out.println("Hello world");
        m.show();

        bc.turnOn();
        bc.listAvailable();
        bc.pair("To other devideName");
        bc.connect("To other devideName");


        bc.turnOff();
    }
}
