public class Main {
    
    public static void main(String[] args) {

        // object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffee shop)

        // note: we have to create a new class in order to create an object
        // while creating objects, we can either create it outside of the main class or we can create a new separate file which contains the object's class.
        // I'm creating a new file containing class car consis of car objects.
        
        Car mycar1 = new Car();
        Car mycar2 = new Car();

        System.out.println();
        System.out.println(mycar1.model);
        System.out.println(mycar1.make);
        System.out.println(mycar1.color);

        System.out.println();
        System.out.println(mycar2.model);
        System.out.println(mycar2.make);
        System.out.println(mycar2.color);
        System.out.println();

        //mycar.drive();
        //mycar.brake();

        
    }

}


