import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter monthly gross salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter HRA (House Rent Allowance): ");
        double hra = scanner.nextDouble();

        System.out.print("Enter PF (Provident Fund): ");
        double pf = scanner.nextDouble();

        double annualSalary = monthlySalary * 12;

        double deductions = hra + pf;

        double taxableIncome = annualSalary - deductions;
        double totalTax = 0;
        if (taxableIncome <= 500000) {
            totalTax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            totalTax = 50000 + (taxableIncome - 500000) * 0.20; 
        } else {
            totalTax = 150000 + (taxableIncome - 1000000) * 0.30; 
        }
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Deductions (HRA + PF): " + deductions);
        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Total Tax: " + totalTax);
    }
}