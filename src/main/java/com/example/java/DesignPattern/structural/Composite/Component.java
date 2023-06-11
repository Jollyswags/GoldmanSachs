package com.example.java.DesignPattern.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    AccountSatatement accStatement;
    List<Component> list=new ArrayList<>();
    public abstract float getBalance();
    public abstract AccountSatatement getStatement();
    public void add(Component g){
        list.add(g);
    }
    public void remove(Component g){
        list.remove(g);
    }
    public Component getChild(int i){
        return (Component) list.get(i);
    }


}
