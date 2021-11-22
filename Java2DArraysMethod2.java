public class Java2DArraysMethod2 {
    public static void main(String[] args){

        // 2D arrays =  arrays inside array -- same as method 1, but syntax changes

        String[][] cars = {
            {"tesla","ford","audi"},
            {"mercedez","volvo","hyundai"},
            {"lambo","silverado","corvette"}
        };

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+"  ");
            }
        }

    }
}
