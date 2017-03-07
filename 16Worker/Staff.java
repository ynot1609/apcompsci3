public class Staff implements Employee
{
    // instance variables
    private int id;
    private int age;
    private int yearsOnJob;
    private double salary;
    
    // constructors
    public Staff(int i, int a, int y, double s)
    {
        id = i;
        age = a;
        yearsOnJob = y;
        salary = s;
    }
    
    // accessor methods
    public int getID()
    {
        return id;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getYearsOnJob()
    {
        return yearsOnJob;
    }
    
    public double getSalary()
    {
        return salary;
    }
}