package com.example.java.java11.teeing;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(123, "TDS2", 50000),
                new Employee(234, "TDS3", 70000),
                new Employee(345, "Intern", 20000),
                new Employee(456, "AL", 90000));

        HashMap<String, Employee> result = employeeList.stream().collect(
                Collectors.teeing(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                        (e1, e2) -> {
                            HashMap<String, Employee> map = new HashMap();
                            map.put("MAX", e1.get());
                            map.put("MIN", e2.get());
                            return map;
                        }
                ));
        for (Map.Entry<String,Employee> mapElement : result.entrySet()){
            String key = mapElement.getKey();
            Employee emp=mapElement.getValue();
            System.out.println(key+"   "+emp.id+"    "+emp.name+"    "+emp.salary);
        }
    }
}
