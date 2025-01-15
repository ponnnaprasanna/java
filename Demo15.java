
    import java.util.Scanner;

public class Demo15 {
    public static void getFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(first);
            } else if (i == 1) {
                System.out.print(", " + second);  
            } else {
                int next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
        }
        System.out.println();  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        getFibonacciSeries(n);
        
        scanner.close();
    }
}


