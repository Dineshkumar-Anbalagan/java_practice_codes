public class Java2DArraysMethod1 {
    public static void main(String[] args){

        // 2D array ==> an array of arrays

        String[][] cars = new String[3][3];

        cars[0][0] = "camero";
        cars[0][1] = "corvette";
        cars[0][2] = "silverado";
        cars[1][0] = "mustang";
        cars[1][1] = "tesla";
        cars[1][2] = "ford";
        cars[2][0] = "hyundai";
        cars[2][1] = "audi";
        cars[2][2] = "mercedes";

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+"  ");
            }
        }
    }   
}
