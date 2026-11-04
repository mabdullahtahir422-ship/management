/*import java.util.Scanner;
public class Salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================Salary Slip====================");
        System.out.printf("Enter Employee name:                                         :          ");
        String employeName = sc.nextLine();
        System.out.print("Enter Basic salary:                                          :          ");
        double salary = sc.nextDouble();

        final double houseRent = salary/100*40;
        System.out.printf("40%% house rent of the basic salary is:                       :         %.2f%n", houseRent);
        final double medicalAllowance = salary/100.0*10.0;
        System.out.printf("10%% medical allowance of the basic salary is:                :         %.2f%n", medicalAllowance);

        double grossSalary = salary+houseRent+medicalAllowance;
        System.out.printf("Gross salary is:                                             :         %.2f%n", grossSalary);
        double incomeTax = grossSalary/100.0*5.0;
        System.out.printf("5%% income tax of the gross salary:                           :         %.2f%n", incomeTax);
        double netSalary = grossSalary-incomeTax;
        System.out.printf("Net salary is:                                               :         %.2f%n", netSalary);
        int netWholeRupees = (int)(netSalary + 0.5);
        System.out.println("Net (whole rupees):                                          :         " +netWholeRupees);
    }
}*/

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();
        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();
        final double hR = salary / 100.0 * 40.0;
        final double medical = salary / 100.0 * 10.0;
        double grossSal = salary + hR + medical;
        double incomeTax = grossSal / 100.0 * 5.0;
        double netSalary = grossSal - incomeTax;
        int netWholeRupees = (int)(netSalary + 0.5);
        System.out.println("========== SALARY SLIP ==========");
        System.out.printf("%-20s : %s%n", "Employee", employeeName);
        System.out.printf("%-20s : %10.2f%n", "Basic Salary", salary);
        System.out.printf("%-20s : %10.2f%n", "House Rent (40%)", hR);
        System.out.printf("%-20s : %10.2f%n", "Medical (10%)", medical);
        System.out.printf("%-20s : %10.2f%n", "Gross Salary", grossSal);
        System.out.printf("%-20s : %10.2f%n", "Tax (5%)", incomeTax);
        System.out.printf("%-20s : %10.2f%n", "Net Salary", netSalary);
        System.out.printf("%-20s : %10d%n", "Net (whole rupees)", netWholeRupees);}}