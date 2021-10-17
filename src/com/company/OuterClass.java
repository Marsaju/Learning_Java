package com.company;

// Inner class => private o protected
//    ==>
public class OuterClass
{
    private int x = 10;

    public int getX()
    {
        return x;
    }

    static class InnerClass
    {
        private int y = 5;
        public int getY(){return y;}
    }


}
