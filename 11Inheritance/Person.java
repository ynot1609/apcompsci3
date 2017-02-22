public class Person
{
    // instance variables
    private String name;
    private String address;
    private String phone;
    
    // constructors
    public Person(String n, String a, String p)
    {
        name = n;
        address = a;
        phone = p;
    }
    
    // accessor methods
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    // toString method
    public String toString()
    {
        String result = "";
        result += "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        return result;
    }
}