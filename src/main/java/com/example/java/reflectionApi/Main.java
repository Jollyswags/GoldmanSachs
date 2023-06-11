package com.example.java.reflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        Bankingdetails obj=new Bankingdetails();
        Class cls = obj.getClass();

        Field field = cls.getDeclaredField("accountName");
        field.setAccessible(true);
        field.set(obj, "Jolly");

        Method method1 = cls.getDeclaredMethod("getAccountName");
        method1.setAccessible(true);
        method1.invoke(obj);

        Method method2 = cls.getDeclaredMethod("getAccountNumber");
        method2.invoke(obj);

        Method method3 = cls.getDeclaredMethod("getDetails");
        method3.setAccessible(true);
        method3.invoke(obj);

        Constructor constructor = cls.getConstructor();
        System.out.println("Constructor is " +
                constructor.getName());

        System.out.println("Methods of class are : ");
        Method[] methods = cls.getMethods();
        for (Method method:methods)
            System.out.println(method.getName());



    }
}
