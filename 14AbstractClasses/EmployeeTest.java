public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee worker = new Hourly("Alice", "1212", 8.5, 180);
        Employee laborer = new Salary("Bob", "8983", 65000.0);

        System.out.println(worker);
        System.out.println(laborer);
    }
}