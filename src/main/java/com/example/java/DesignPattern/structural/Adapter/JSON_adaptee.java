package com.example.java.DesignPattern.structural.Adapter;

public class JSON_adaptee implements AdapterInterface{
    public DataAdaptee adaptee;
    public JSON_adaptee(DataAdaptee adaptee){
        this.adaptee=adaptee;
    }
    public String GetData()
    {
        var xml = adaptee.GetData();
        return xml;
    }



}
