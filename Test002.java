import java.util.Scanner;
public class Test002{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String result;
    
            while (true) {
                System.out.println("Enter value:");
                result = sc.next();
                sc.close();
    
                if (result.equals("yes") ) {
                    System.out.println("Happy Sankranthi ");
                    break;
                }
                else{
                    return;
                }
                }
            }
          
        }