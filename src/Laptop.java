public class Laptop extends Computer {
    int storage;

    Laptop(String brand, String model, int releaseYear, int storage){
        super (brand,model, releaseYear);
        this.storage = storage;
    }

    public void getStorage(){
        System.out.println("Storage in GB = " + storage);

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

