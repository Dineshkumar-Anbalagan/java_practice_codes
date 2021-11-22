public class JavaMathFunction {
    public static void main(String[] args){
        
        double x = 27.5;
        double y = -10;
        double z = Math.max(x, y);
        double w = Math.min(x, y);
        double absolute = Math.abs(y);
        double square_root = Math.sqrt(absolute);
        double round_val = Math.round(x);
        double ceil_val = Math.ceil(x);
        double floor_val = Math.floor(x);

        System.out.println("The max value is : "+z);
        System.out.println("The min value is : "+w);
        System.out.println("The bas value is : "+absolute);
        System.out.println("The sqrt value is : "+square_root);
        System.out.println("The rounded value is : "+round_val);
        System.out.println("The up rounded value is : "+ceil_val);
        System.out.println("The down rounded value is : "+floor_val);
    }
}
