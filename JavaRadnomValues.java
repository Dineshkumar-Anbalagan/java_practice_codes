import java.util.Random;
import java.util.Scanner;

/*

    Random number are not actually random, they are creted based on pesudo random numbers

*/

public class JavaRadnomValues {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Integers random
        System.out.println("Enter the range in integer : ");
        int val1 = scanner.nextInt();
        int x = random.nextInt(val1);
        System.out.println("random integer generated using random: "+x);

        // Random double
        System.out.println("Enter the range in integer : ");
        int val2 = scanner.nextInt();
        double y = random.nextDouble(val2);
        System.out.println("random double generated using random : "+y);

        // Random float
        System.out.println("Enter the range in integer : ");
        int val3 = scanner.nextInt();
        float z = random.nextFloat(val3);
        System.out.println("random float generated using random : "+z);

        // boolean random
        boolean b = random.nextBoolean();
        System.out.println("random boolean values generated using random : "+b);

        scanner.close();
    }
}
