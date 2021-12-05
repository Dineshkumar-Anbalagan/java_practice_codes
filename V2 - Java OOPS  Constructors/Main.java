
public class Main {

    public static void main(String[] args){
        
        // constructor = a special method that is called when an object is instantiated(created)

        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Dinesh", 40, 60);

        System.out.println(human1.name+"\t"+human1.age);
        System.out.println(human2.name+"\t"+human2.age);


        human1.drink();
        human2.eat();

    }
}
