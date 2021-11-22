public class ExpressionOperandsOperators {
    public static void main(String[] args) {

        // expressions = operands & operators
        // operands = values,variables, numbers, quantity
        // operators = +,-,/,%,* etc...
        
        int number_of_friends = 12;
        System.out.println("Number of frnds before college : "+number_of_friends);
        number_of_friends = number_of_friends + 3;
        System.out.println("Number of frnds after college : "+number_of_friends);

        double x = 10;
        System.out.println("number of students in class : "+x);
        double number_of_teams = 3;
        double number_of_students_in_each_team = x/number_of_teams;
        System.out.println("So, each team should consist of "+number_of_students_in_each_team+" student");

        int y = 10;
        System.out.println("Value before : "+y);
        y = y/3;
        System.out.println("Value after : "+y+" ==> But it's 3.33333 right?");
        
        // In order to get a decimal value, we have to explicitly provide a datatype infront like below.

        double z = 10;
        System.out.println("Value before : "+z);
        z = z/3;
        System.out.println("Value after : "+z);

    }
}
