package com.example.java.DesignPattern.creational.Singleton.Enum;

public enum EnumSingleton {
    INSTANCE;
    int value;
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value=value;
    }
}
