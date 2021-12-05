import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args){

        // ArrayList = a resizable array.
        //             elements can be added and removed after compilation phase.
        //             store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        // ==> looping to print the values.
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

        // ==> replacing existing values with new values in arraylist:
        food.set(0, "sushi");
        System.out.println("AFTER REPLACED INDEX 0 WITH SUSHI=============");
        for(int j=0; j<food.size(); j++){
            System.out.println(food.get(j));
        }

        // ==> removing value in a arraylist based on index.
        food.remove(0);
        System.out.println("AFTER REMOVING INDEX 0 WITH SUSHI=============");
        for(int j=0; j<food.size(); j++){
            System.out.println(food.get(j));
        }

        // ==> clearing array list:
        food.clear();
        System.out.println("AFTER CLEARING FOOD ARRAYLIST=============");
        for(int j=0; j<food.size(); j++){
            System.out.println(food.get(j));
        }
    }
}
