//----------------------------------------------------------
// File Name:	Salad.java
// Description:	2014 AP Free Response Question 4.
// Programmer:	Alwin Tareen
// Last Edited:	Mar 11, 2015
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac Salad.java
// Execution:	<non-executable>
//----------------------------------------------------------

public class Salad implements MenuItem
{
    // Instance variables
    private String name;
    private double price;

    // Constructors
    public Salad(String sName, double sPrice)
    {
        name = sName;
        price = sPrice;
    }

    // Accessor methods
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}


