import java.util.Scanner;

public class JavaNestedForLoop {
    public static void main(String[] args){

        // nested loop : a loop inside a loop

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Enter the number of columns : ");
        int columns = scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Enter the symbol that you wanna display");
        String symbol = scanner.next();

        for(int i=1;i<=rows;i++){
            System.out.println();
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        }

        scanner.close();



    }
    
}
