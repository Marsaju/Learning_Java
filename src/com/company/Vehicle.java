package com.company;

public class Vehicle
{
    protected String brand = "Ford";

    public void Sound(){System.out.println("rum rum");}
}


class Car extends Vehicle   // Car hereda atributos  y métodos de Vehicle
{
    private String model = "Mustang";

    public void Sound(){System.out.println("ruuuuuuuuuuuuu");}
    public String getModel()
    {
        return model;
    }

}