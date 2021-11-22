import java.util.Scanner;

public class JavaUserInputsAccepting{
    public static void main(String[] args) {
        // ==> code for taking user inputs

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ua name buddy!");
        String name = scanner.nextLine();
        System.out.println("Hello "+name+" How was ua day huh?");
        String sentiment = scanner.nextLine();
        System.out.println("Glad to hear that you has a "+sentiment+" day!");
        System.out.println("Well, how old are you if you don't mind me asking?");
        int age = scanner.nextInt();
        // ==> we have to use scanner.nextline() method after using scanner.nextInt() in order to clear out the new line char
        scanner.nextLine();
        System.out.println("Wait! seriously??? are you really "+age);
        System.out.println("That's cool "+name+". So, afterall you are just around same age as me hehe!!");
        System.out.println("Where are you form btw?...");
        String place = scanner.nextLine();
        System.out.println("Damn! I'm also from "+place+"... seems like we can become frnds hehe");
        scanner.close();
    }
};