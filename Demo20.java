public class Demo20 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(232)); 
        System.out.println(isPalindrome(345)); 
        System.out.println(isPalindrome(-121)); 
        System.out.println(isPalindrome(0)); 
    }

    public static int isPalindrome(int x) {
        if (x <= 0) {
            return -1;
        }

        int original = x; 
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10; 
            reversed = reversed * 10 + digit; 
            x /= 10; 
        }

        if (original == reversed) {
            return 1;
        } else {
            return 0;
        }
    }
}