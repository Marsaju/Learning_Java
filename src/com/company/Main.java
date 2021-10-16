package com.company;
import java.util.Scanner;   // User input class from keyboard
import com.company.Person;  // Importem la classe Person per poder treballar amb ella


// Static methods can be called without creating objects
// Public methods must be called by creating objects

/*

    The dot (.) is used to access the object's attributes and methods.

    To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

    A class must have a matching filename (Main and Main.java).

*/

// java file should match the class name



public class Main
{
    // atributs
    int x;
    int y;

    public Main()   // Constructor per setejar valors inicials d'un objecte
    {
        y = 11;
    }

    public Main(int z)   // Constructor per setejar valors inicials d'un objecte
    {
        x = z;
    }

    static void printStatic()
    {
        System.out.println("Static methods can be called without creating objects");
    }

    public void printPublic()
    {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args)
    {
        Main myObjy = new Main();    // Es crida al constructor al crear l'objecte
        Main myObjx = new Main(8);

        System.out.println(myObjy.y);
        System.out.println(myObjx.x);

        printStatic();
        myObjy.printPublic();

        Person Pep = new Person();

        System.out.println(Pep.getName());  // Marc
        Pep.setName("Pep");
        System.out.println(Pep.getName());  // Pep


        // input data from keyboard
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Introducí user pa");
        String userName = inputUser.nextLine();
        System.out.println("Username is: " + userName);

    }
}
