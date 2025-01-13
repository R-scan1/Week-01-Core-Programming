import java.util.Random;

public class EmployeeBonus {

    public static double[][] generateSalaryAndYears(int numEmployees) {
        Random random = new Random();
        double[][] salaryAndYears = new double[numEmployees][2];
        
        for (int i = 0; i < numEmployees; i++) {
            salaryAndYears[i][0] = 10000 + random.nextInt(90000);
            salaryAndYears[i][1] = 1 + random.nextInt(20);
        }
        
        return salaryAndYears;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] salaryAndYears) {
        double[][] newSalaryAndBonus = new double[salaryAndYears.length][3];

        for (int i = 0; i < salaryAndYears.length; i++) {
            double salary = salaryAndYears[i][0];
            double yearsOfService = salaryAndYears[i][1];
            double bonusPercentage = (yearsOfService >= 5) ? 0.05 : 0.02;

            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            newSalaryAndBonus[i][0] = salary;       
            newSalaryAndBonus[i][1] = newSalary;  
            newSalaryAndBonus[i][2] = bonus;       
        }
        return newSalaryAndBonus;
    }

    public static void displayTotalAndTabular(double[][] salaryAndYears, double[][] newSalaryAndBonus) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee | Old Salary | New Salary | Bonus");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < salaryAndYears.length; i++) {
            double oldSalary = newSalaryAndBonus[i][0];
            double newSalary = newSalaryAndBonus[i][1];
            double bonus = newSalaryAndBonus[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%8d  | %10.2f | %10.2f | %10.2f\n", (i + 1), oldSalary, newSalary, bonus);
        }

        System.out.println("---------------------------------------------");
        System.out.printf("Total     | %10.2f | %10.2f | %10.2f\n", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        
        double[][] salaryAndYears = generateSalaryAndYears(numEmployees);
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(salaryAndYears);
        displayTotalAndTabular(salaryAndYears, newSalaryAndBonus);
    }
}

