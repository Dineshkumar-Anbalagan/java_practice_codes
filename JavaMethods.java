import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args){

        // method - a block of code that is executed whenever it is called upon

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        hello(name);
        scanner.close();

        // String x = hello(name);
        // System.out.println(x);
    }

    // method always starts with lowecase
    static void hello(String name){ // we can also pass more than one argument inside our method using ",".
        System.out.println("Hello! " + name);
        // we can use return instead of the above line and assign it to a variable in main area.

        //   String z = "Hello! " + name;
        //   return z;
    }
}
