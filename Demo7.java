import java.util.Scanner;

public class Demo7 {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter your name: ");
        String name = input.nextLine(); 

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your phone number: ");
        int phone = input.nextInt(); 

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone);

        input.close(); 
    }
}
