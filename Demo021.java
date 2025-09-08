import java.util.Scanner;

public class Demo021 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your monthly gross salary: ");
        double monthlyGrossSalary = scanner.nextDouble();
        
        System.out.print("Enter your monthly HRA: ");
        double hra = scanner.nextDouble();
        
        System.out.print("Enter your monthly PF: ");
        double pf = scanner.nextDouble();
        
        double annualSalary = monthlyGrossSalary * 12;
        double annualHra = hra * 12;
        double annualPf = pf * 12;
        
        double totalDeductions = annualHra + annualPf;
        
        double taxableIncome = annualSalary - totalDeductions;
       
        double tax = 0;
     
        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = 50000 + (taxableIncome - 500000) * 0.20;
        } else {
            tax = 150000 + (taxableIncome - 1000000) * 0.30;
        }
        
        System.out.println("\nAnnual Income: Rs " + annualSalary);
        System.out.println("Total Deductions (HRA + PF): Rs " + totalDeductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Total Annual Tax Payable: Rs " + tax);
        
        scanner.close();
    }
}
