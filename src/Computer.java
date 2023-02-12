public class Computer {

    String brand;
    String model;
    int releaseYear;

    public Computer(String brand, String model, int releaseYear){
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
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
