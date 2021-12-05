public class JavaPrintf {
    public static void main(String[] args){
        // printf =  an optimal method to control, format and display text to the console window
        //           two arguments = format string + (object / variable / value)
        //           % [flags] [precision] [width] [conversion character]

        System.out.printf("This is a format string %f\n", 21.0);
        System.out.printf("This is a format string %.2f\n", 21.0);
        System.out.printf("This is a format string %b\n", true);
        System.out.printf("This is a format string %s\n", "string");
        System.out.printf("This is a format string %d\n", 21);
    }
    
}
