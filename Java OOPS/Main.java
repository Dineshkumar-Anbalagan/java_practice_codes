public class Main {
    
    public static void main(String[] args) {

        // object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffee shop)

        // note: we have to create a new class in order to create an object
        // while creating objects, we can either create it outside of the main class or we can create a new separate file which contains the object's class.
        // I'm creating a new file containing class car consis of car objects.
        
        Car mycar = new Car();

        System.out.println(mycar.model);

        
    }

}

class Car {
    // attributes of the car
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 5000000.00;

    // methods - the actions that our car object can perform
    void drive(){
        System.out.println("you drive the car");
    }

    void brake(){
        System.out.println("you stepped on the brakes");
    }

}


