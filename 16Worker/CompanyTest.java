import java.util.*;

public class CompanyTest
{
    public static void main(String[] args)
    {
        Company business = new Company(60, 20, 40000);
        business.addEmployee(new Staff(100, 70, 35, 100000.0));
        business.addEmployee(new Staff(200, 60, 40, 80000.0));
        business.addEmployee(new Staff(300, 62, 25, 50000.0));
        business.addEmployee(new Staff(400, 68, 37, 64000.0));
        business.addEmployee(new Staff(500, 75, 20, 200000.0));
        business.addEmployee(new Staff(600, 66, 27, 52000.0));
        business.addEmployee(new Staff(700, 50, 15, 38000.0));
        
        ArrayList<Employee> roster = business.getEmployees();
        for (Employee item : roster)
        {
            System.out.print(item.getID() + " ");
            System.out.print(item.getAge() + " ");
            System.out.print(item.getYearsOnJob() + " ");
            System.out.println(item.getSalary());
        }
        
        business.calculateSalaryBudget();
        System.out.println("Salary Budget = " + business.getSalaryBudget());
        
        System.out.println("\nPart a: employeeIsEligible and Part b: processRetirements");
        System.out.println("---------------------------------------------------------");
        business.processRetirements();
        ArrayList<Employee> faculty = business.getEmployees();
        for (Employee item : faculty)
        {
            System.out.print(item.getID() + " ");
            System.out.print(item.getAge() + " ");
            System.out.print(item.getYearsOnJob() + " ");
            System.out.println(item.getSalary());
        }
        
        System.out.println("Salary Budget = " + business.getSalaryBudget());
    }
}