//----------------------------------------------------------
// File Name:	Drink.java
// Description:	2014 AP Free Response Question 4.
// Programmer:	Alwin Tareen
// Last Edited:	Mar 11, 2015
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac Drink.java
// Execution:	<non-executable>
//----------------------------------------------------------

public class Drink implements MenuItem
{
    // Instance variables
    private String name;
    private double price;

    // Constructors
    public Drink(String dName, double dPrice)
    {
        name = dName;
        price = dPrice;
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


