import java.util.Scanner;

public class JavaLogicalOperators2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Heya! Welcome to my game... Please enter your name below!");
        String name = scanner.nextLine();

        System.out.println("Hi "+name+"! welcome to the my gaming world");
        System.out.println("Enter q or Q to quit the game");
        String response = scanner.next();
        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game *pew pew*");
        }
       else{
           System.out.println("You quit the game");
       }
       scanner.close();
    }
}
