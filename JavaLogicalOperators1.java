public class JavaLogicalOperators1 {
    public static void main(String[] args){

        // Logical operator : Used to connect two or more expressions
        //      
        //                      && = AND ==> Both conditions must be true.
        //                      || = OR ==> Atleast one condition must be true.
        //                       ! = NOT ==> reverses boolean value of a condition. (Not equal to)

        int temp = 15;

        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("It's cold outside");
        }
    }
}
