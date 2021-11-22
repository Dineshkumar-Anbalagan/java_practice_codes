import java.util.Scanner;

public class filename{
    public static void main(String[] args) {
        //int age = 21;
        //double score = 23.45;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Heya! Pleasure to meet you. Mind if I ask what ua name is?");
        String name = scanner.nextLine();
        System.out.println("That's a nice name! Pleasure to meet you "+name);
        System.out.println("This is Dinesh and how old are you huh?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("wait! what??? seriously????.... You look way more younger than me LoL. Btw, I'm also "+age);
        System.out.println("Well, where are you from btw?");
        String location = scanner.nextLine();
        System.out.println("Lol! you must be kidding me. I'm also from the same area as you hehe. "+location);
        scanner.close();
        
    }
}
