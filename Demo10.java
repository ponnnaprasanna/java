public class Demo10 {
    public static void main(String[] args) {
        int x = 5;
        int y = -10;
        System.out.println("Unary plus: +" + x + " = " + (+x));
        System.out.println("Unary minus: -" + x + " = " + (-x)); 
        System.out.println("Initial value of x: " + x);
        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("After post-increment, x: " + x);
        System.out.println("Pre-increment (++x): " + (++x)); 
        System.out.println("Post-decrement (x--): " + (x--)); 
        System.out.println("Pre-decrement (--x): " + (--x)); 
        boolean flag = true;
        System.out.println("Logical NOT of " + flag + ": " + (!flag));
        System.out.println("Bitwise complement of y: ~" + y + " = " + (~y));
    }
}
