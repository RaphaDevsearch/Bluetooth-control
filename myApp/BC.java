package myApp;
public class BC{

    private String deviceName;
    private String otherDevice;

    public BC(){
        this.deviceName = "My computer";
        this.otherDevice = "Other device";
    }

    

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }



    public void setOtherDevice(String otherDevice) {
        this.otherDevice = otherDevice;
    }



    public String getDeviceName(){return this.deviceName;}
    public String getOtherDeviceName() {return this.otherDevice;}
    
    public void turnOn() {
        System.out.println("[Bluetooth] Turning ON...");
    }

    public void turnOff() {
        System.out.println("[Bluetooth] Turning OFF...");
    }

    public void listAvailable() {
        System.out.println("[Bluetooth] Scanning for available devices...");
    }

    public void pair(String device) {
        System.out.println("[Bluetooth] Pairing with " + device);
    }

    public void unpair(String device) {
        System.out.println("[Bluetooth] Unpairing " + device);
    }

    public void connect(String device) {
        System.out.println("[Bluetooth] Connecting to " + device);
    }

    public void disconnect(String device) {
        System.out.println("[Bluetooth] Disconnecting " + device);
    }

    public boolean isPaired(String device) {
        System.out.println("[Bluetooth] Checking if " + device + " is paired...");
        return false;
    }

    public boolean isConnected(String device) {
        System.out.println("[Bluetooth] Checking if " + device + " is connected...");
        return false;
    }

    public void getStatus() {
        System.out.println("[Bluetooth] Getting status...");
    }



    public String getOtherDevice() {
        return otherDevice;
    }
}