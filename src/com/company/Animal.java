package com.company;

// not be used to create objects (to access it, it must be inherited from another class).
// can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
abstract class Animal
{
    public abstract void animalSound(); // Method with no body
    public void sleep()                 // Regular Method
    {
        System.out.println("zzz");
    }

}

class Pig extends Animal
{
    public void animalSound()
    {
        System.out.println("The pig says: wee wee");
    }
}
