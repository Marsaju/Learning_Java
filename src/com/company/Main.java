package com.company;


// Static methods can be called without creating objects
// Public methods must be called by creating objects

public class Main
{
    int y = 10;

    public void printStatic()
    {
        System.out.println("Static methods can be called without creating objects");
    }

    public void printPublic()
    {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args)
    {
        Main myObj = new Main();

        System.out.println(myObj.y);

        myObj.printStatic();
        myObj.printPublic();

	// write your code here
    }
}
