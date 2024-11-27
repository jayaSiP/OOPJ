import java.util.Scanner;

interface Payable {
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}

class Manager implements Payable {
    @Override
    public double earnings(double basicSalary) {
        double da = 0.8 * basicSalary;
        double hra = 0.15 * basicSalary;
        return basicSalary + da + hra;
    }

    @Override
    public double deductions(double basicSalary) {
        return 0.12 * basicSalary; 

    
    @Override
    public double bonus(double basicSalary) {
        return 0; 
    }
}


class Substaff extends Manager {
    @Override
    public double bonus(double basicSalary) {
        return 0.5 * basicSalary; 
    }
}

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        Manager manager = new Manager();
        Substaff substaff = new Substaff();

        
        System.out.println("Earnings: " + manager.earnings(basicSalary));
        System.out.println("Deductions: " + manager.deductions(basicSalary));
        System.out.println("Bonus: " + substaff.bonus(basicSalary));
    }
}