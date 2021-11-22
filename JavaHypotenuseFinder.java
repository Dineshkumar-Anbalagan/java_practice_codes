import java.util.Scanner;

public class JavaHypotenuseFinder {
    public static void main(String[] args){
        double x; double y; double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y : ");
        y = scanner.nextDouble();
        // hypotenuse formula = sqrt(x^2+y^2)
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse of a triangle is : "+z);
        scanner.close();
    }
    
}
