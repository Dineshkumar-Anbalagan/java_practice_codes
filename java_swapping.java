public class java_swapping {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Kool-Aid";
        String temp;
        System.out.println("before swap =============================|");
        System.out.println("x has : "+x);
        System.out.println("y has : "+y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("after swap =============================|");
        System.out.println("x has : "+x);
        System.out.println("y has : "+y);

    }
    
}
