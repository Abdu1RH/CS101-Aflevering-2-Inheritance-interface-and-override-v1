public class Car implements Vehicle {
private String carBrand;

private String carModel;


Car(String carBrand, String carModel){
    this.carBrand = carBrand;
    this.carModel = carModel;
}

    @Override
    public void changeGear(int a) {
        System.out.println("Change Gear");
    }

    @Override
    public void speedUp(int a) {
        System.out.println("Speed up");
    }

    @Override
    public void applyBrakes(int a) {
        System.out.println("Brake");
    }

    @Override
    public String toString() {
        return "Car{" +
                " Car Brand='" + carBrand + '\'' +
                ", Car Model='" + carModel +
                '}';
    }

}



