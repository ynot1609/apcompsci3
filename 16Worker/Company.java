import java.util.*;

public class Company
{
    // instance variables
    private ArrayList<Employee> empList;
    private int retireAge;
    private int retireYears;
    private int retireSalary;
    private double salaryBudget;
    
    // constructors
    public Company(int age, int years, int salary)
    {
        empList = new ArrayList<Employee>();
        retireAge = age;
        retireYears = years;
        retireSalary = salary;
    }
    
    private boolean employeeIsEligible(Employee emp)
    {
        // YOUR CODE HERE
        
    }
    
    public void processRetirements()
    {
        // YOUR CODE HERE
        
    }
    
    public void addEmployee(Employee e)
    {
        empList.add(e);
    }
    
    public ArrayList<Employee> getEmployees()
    {
        return empList;
    }
    
    public void calculateSalaryBudget()
    {
        salaryBudget = 0;
        for (Employee item : empList)
        {
            salaryBudget += item.getSalary();
        }
    }
    
    public double getSalaryBudget()
    {
        return salaryBudget;
    }
}