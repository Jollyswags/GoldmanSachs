package com.example.java.DesignPattern.creational.Protoype;

public class TestPrototypePattern
{
    public static void main(String[] args)
    {
        try
        {
            //String apacPrototype  = PrototypeFactory.getInstance(Region.APACS).toString();
            System.out.println(PrototypeFactory.getInstance(Region.APACS).toString());
            String emeaPrototype  = PrototypeFactory.getInstance(Region.EMEAS).toString();
            System.out.println(emeaPrototype);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
