public class JavaForLoop2{
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            String x = "*";
            String pattern = x.repeat(i);
            System.out.println(pattern);
        }

        for(int i=5;i>0;i--){
            String x = "*";
            String pattern = x.repeat(i);
            System.out.println(pattern);
        }
        
    }
}