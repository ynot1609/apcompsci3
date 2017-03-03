public abstract class Employee
{
    private String name;
    private String idNumber;
    
    public Employee(String n, String id)
    {
        name = n;
        idNumber = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getIDNumber()
    {
        return idNumber;
    }
    
    public String toString()
    {
        String result = "";
        result += "Name: " + name + "\n";
        result += "ID Number: " + idNumber + "\n";
        result += "Monthly salary: " + getSalary() + "\n";
        return result;
    }
    
    public abstract double getSalary();
}