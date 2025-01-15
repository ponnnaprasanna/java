import java.util.Scanner;

public class Demo27 {
    public static void printFibonacci(int n) {
        if (n > 0) {
            printFibonacci(n - 1);  
            System.out.print(fibonacci(n - 1) + " ");  
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci Series:");
        printFibonacci(n);
        scanner.close();
    }
}