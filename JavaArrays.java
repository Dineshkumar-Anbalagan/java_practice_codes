public class JavaArrays {
    public static void main(String[] args) {

        // array : used to store multiple values in a single variable

        /*
        String[] cars = {"Camaro", "Corvette", "Tesla"};

        System.out.println("before replacing : " + cars);
        cars[0] = "Mustang";
        cars[1] = "Toyota";
        cars[2] = "Mitsubishi";

        System.out.print("after replacing : " + cars);
        */

        String[] cars = new String[3]; // since we have provided three, it will only take three values inside it.

        cars[0] = "camaro";
        cars[1] = "corvettr";
        cars[2] = "tesla";
        //cars[3] = "mustang"; // fourth value cannot be stored in the list

        for(int i=0; i<=2; i++){
            System.out.println(cars[i]);
        }
    }
}
