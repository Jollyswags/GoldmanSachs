package com.example.java.collections.mapcomparator;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Employee, String> map=new HashMap<>();
        map.put(new Employee("Swagata","15517"),"MuSigma");
        map.put(new Employee("Jolly","199001"),"GS");
        map.put(new Employee("Swagata","15516"),"Hp");

     /*   Map<Employee, String> tmap=new TreeMap<Employee,String >(
                new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2){
                        int comp= e2.getName().compareTo(e1.getName());
                        if(comp!=0)
                            return comp;
                        comp= e1.getId().compareTo(e2.getId());
                        return comp;
                    }
                }
        );*/

        Map<Employee, String> tmap=new TreeMap<>(
                (Comparator<Employee>) (e1,e2) ->{
                    int comp= e2.getName().compareTo(e1.getName());
                    if(comp!=0)
                        return comp;
                    comp= e1.getId().compareTo(e2.getId());
                    return comp;
                }
        );
        tmap.putAll(map);
        tmap.forEach((key,value)->
                {
                    System.out.print(key.id+"  "+key.name+"          ");
                    System.out.println(value);
                }
        );
    }

}
