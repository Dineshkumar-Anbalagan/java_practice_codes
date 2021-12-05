import java.util.*;

public class Java2DArrayList {
    public static void main(String[] args){
        
        // comparing to general 2d list, array2dlist is dynamic, we don't have to predefine the size

        ArrayList<ArrayList<String>> grocerylist = new ArrayList();

        ArrayList<String> bakerylist = new ArrayList();
        bakerylist.add("pasta");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts");

        ArrayList<String> productlist = new ArrayList();
        productlist.add("tomatoes");
        productlist.add("zucchini");
        productlist.add("peppers");

        ArrayList<String> drinklist = new ArrayList();
        drinklist.add("soda");
        drinklist.add("coffee");

        grocerylist.add(bakerylist);
        grocerylist.add(productlist);
        grocerylist.add(drinklist);

        // printing the 2d list
        System.out.println(grocerylist);

        // accessing values 2d list one by one
        for(int i = 0; i<grocerylist.size(); i++){
            System.out.println(grocerylist.get(i));
        }
    }
}
