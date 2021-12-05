public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;
    String additional;

    Pizza(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }

    Pizza(String bread, String sauce, String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }
    
    Pizza(String bread, String sauce, String cheese, String topping, String additional){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
        this.additional = additional;

    }

    // we can also create an obeject with no parameters, but it's return null to each methods

    Pizza(){


    }
    
    
}
