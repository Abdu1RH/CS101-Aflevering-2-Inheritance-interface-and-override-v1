public class SmartPhone extends Computer {
    int batteryPercantage;

    SmartPhone(String brand, String model, int releaseYear, int batteryPercantage){
        super(brand, model, releaseYear);
        this.batteryPercantage = batteryPercantage;
    }

    public void getBatteryPercentage(){
        System.out.println("Battery percentage is on " + batteryPercantage);
    }
    public void computerInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Release Year: " + releaseYear);
    }

    public void computerWifiStatus() {
        System.out.println("Connected To Wifi");
    }
}
