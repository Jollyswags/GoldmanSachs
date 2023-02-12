package com.example.java.DesignPattern.Singleton.Cloanable;

class SuperClass implements Cloneable
{
    int i = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class Singleton extends SuperClass
{
    // public instance initialized when loading the class
    public static Singleton instance = new Singleton();
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return instance;
    }

    private Singleton()
    {
        // private constructor
    }
}
