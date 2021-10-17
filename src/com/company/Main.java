package com.company;
import java.util.Scanner;   // User input class from keyboard
import com.company.Person;  // Importem la classe Person per poder treballar amb ella
import com.company.Vehicle;
import com.company.OuterClass; // inner Class
import com.company.Animal;

import java.util.Iterator;  // Iterator for hashlist o ArrayList

import java.util.LinkedList;    // LinkedList
import java.util.ArrayList;     // Import ArrayList
import java.util.Collections;   // Amb "sort()" pot ordenar una llista numèricament o alfabèticament

// java.util package ==> date and time facilities, random-number generator and other utility classes.


import com.company.Person;  // Importem la classe Person per poder treballar amb ella


// Static methods can be called without creating objects
// Public methods must be called by creating objects

/*

    The dot (.) is used to access the object's attributes and methods.

    To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

    A class must have a matching filename (Main and Main.java).

*/

// java file should match the class name


//enum
enum Level
{
    LOW,
    MEDIUM,
    HiGH
}


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


        // Herencia (herencia atributs i mètodes) & Polimorfism (mateixos mètodes en diferents obj's => Same metode diferent content)

        Vehicle cotxe = new Vehicle();
        cotxe.Sound();

        Car myCar = new Car();
        myCar.Sound();
        System.out.println(myCar.brand + " " + myCar.getModel());

        // Inner Class

        // Si la subclasse és private, no es pot accedir desde fora, si es static si
        // Static, accedida desde fora, ella no pot accedir a la Outer class

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.getY());

        /* Si la Inner no porta private/protected/static
        -- Main:
            OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.myInnerMethod());
        */


        // Abstract classes & methods
        // => interface is a completely "abstract class" that is used to group related methods with empty bodies:

        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        // enum (constant)
        for(Level myVar : Level.values())
        {
            System.out.println(myVar);
        }


        // Input User
        /*

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            // String input
            String name = myObj.nextLine();

            // Numerical input
            int age = myObj.nextInt();
            double salary = myObj.nextDouble();

        */


        // Array List
        /*
            cars.add("something");
            cars.remove(pos);
            cars.set(pos, "thing");
            cars.clear
            cars.size();

        */

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Ferrari");
        cars.add("Tesla");

        Collections.sort(cars); // ordre alfabètic

        for(String i: cars)
        {
            System.out.println(i);
        }

        // LinkedList
        /*
            addFirst()
            addLast()
            removeFirst()
            removeLast()
            getFirst()
            getLast()
        */
        /*
            LinkedList<String> theCar = new LinkedList<String>();

            theCar.add("Laferrari");
            theCar.add("Lamborginini");

            System.out.println(theCar.getFirst());
            System.out.println(theCar.getLast());

            // Iterator

                theCar.addFirst("Toyota");
                Iterator<String> it = theCar.iterator();
                System.out.println(it.next());
        */
    }

}
