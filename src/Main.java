import java.util.ArrayList;

public class Main {
            public static void main(String[] args) {
                //System.out.println("Hello world!");
/*
Inheritance 1
Create a new class called Computer. Before you add any more code, know that you will need to add two additional classes:
Laptop and SmartPhone
For a parent class add 3 properties, 2 methods, and a constructor.
For a child class add at least 1 additional property and 1 additional method.
In the main method create a Laptop and a SmartPhone
*/
/*
                Laptop laptop = new Laptop("HP", "Pavillion", 2019, 1000);
                laptop.computerInfo();
                laptop.getStorage();
                laptop.computerWifiStatus();


                SmartPhone smartPhone = new SmartPhone("Apple", "13", 2021, 82);
                smartPhone.computerInfo();
                smartPhone.computerWifiStatus();
                smartPhone.getBatteryPercentage();

/*

 */
/*
Modelling
We have to create the classes for a School.
This school have different employees 👇
Teacher
Janitor
Headmaster
It admin
There are also classes (as in a school class not a java class). A class can have a list of students and a name.
A school can have a list of classes and a list of employees.
Try and think about the different classes you would need to solve this problem. First write the plan down.
When you have a plan start writing the actual classes to solve this problem.
The functionality inside the methods is not important, but the classes and the class structure is!
For the employees, make a parent class. Think about what specific attributes you would have for the different roles
 */

//Check SchoolEmployees, Teacher, Headmaster, Janitor, ItAdmin, ClassesEmployees classes



/*
Interface 1
Create an interface called FastFood (with appropriate methods) and
create a Sandwich class, a Pizza class and a class you decide that implements the FastFood interface.
Add some different Fastfood objects to an array.
Now iterate through that array and use some of the methods you have created above.
*/
/*
                Sandwich sandwich = new Sandwich("Sandwich", "Chicken Sandwich ", 39.95);
                System.out.println(sandwich.dishType());
                System.out.println(sandwich.dishName());
                System.out.println(sandwich.dishPrice());

                Pizza pizza = new Pizza("Pizza", "Kebab Pizza", 79.99);
                System.out.println(pizza.dishType());
                System.out.println(pizza.dishName());
                System.out.println(pizza.dishPrice());

                Burger burger = new Burger("Burger", "Cheese Burger", 49.99);
                System.out.println(burger.dishType());
                System.out.println(burger.dishName());
                System.out.println(burger.dishPrice());

                ArrayList<FastFood> fastFoods = new ArrayList<>();
                fastFoods.add(sandwich);
                fastFoods.add(pizza);
                fastFoods.add(burger);

                for (int i = 0; i < fastFoods.size(); i++) {
                    System.out.println(fastFoods.get(i));

                }


 */
/*
Interface 2
Create a class that implements the following interface. Now create two objects using the class created
interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
 */
/*
Car car1 = new Car("Volkswagen", "Golf 1,4 Tsi");
    System.out.println(car1);
car1.changeGear(1);
car1.speedUp(1);
car1.applyBrakes(1);


Car car2 = new Car("Seat", "Ibiza");
    System.out.println(car2);
car2.changeGear(1);
car2.speedUp(1);
car2.applyBrakes(1);
 */


/*
Override
Create a class called RapSong with a method called play that prints "Playing a rap song"
Now create a class called OldSchoolRap that extends RapSong and overrides the play method to print "Playing old school rap"
Define a class called NewSchoolRap that extends RapSong and overrides the play method to print "Playing new school rap"
In the Main class, create an instance of each class and call the play method on each
 */
/*
RapSong rapSong = new RapSong();
OldSchoolRap oldSchoolRap = new OldSchoolRap();
NewSchoolRap newSchoolRap = new NewSchoolRap();

rapSong.play();
oldSchoolRap.play();
newSchoolRap.play();
 */


    }


}