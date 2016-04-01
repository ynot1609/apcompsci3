//----------------------------------------------------------
// File Name:	TrioTest.java
// Description:	2014 AP Free Response Question 4.
// Programmer:	Alwin Tareen
// Last Edited:	Mar 11, 2015
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac TrioTest.java
// Execution:	java TrioTest
//----------------------------------------------------------

public class TrioTest
{
    public static void main(String[] args)
    {
        Sandwich sandwich;
        Salad salad;
        Drink drink;

        sandwich = new Sandwich("Cheeseburger", 2.75);
        salad = new Salad("Spinach Salad", 1.25);
        drink = new Drink("Orange Soda", 1.25);

        Trio trio = new Trio(sandwich, salad, drink);
        System.out.println(trio.getName());
        System.out.println(trio.getPrice());


        sandwich = new Sandwich("Club Sandwich", 2.75);
        salad = new Salad("Coleslaw", 1.25);
        drink = new Drink("Cappuccino", 3.50);

        Trio trio3 = new Trio(sandwich, salad, drink);
        System.out.println(trio3.getName());
        System.out.println(trio3.getPrice());
    }
}
