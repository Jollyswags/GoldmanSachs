package com.example.java.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Convertidtostring {
    public static void main(String[] args) {
        List<Student> listStudent=new ArrayList<>();
        listStudent.add(new Student(123,"swagata",50));
        listStudent.add(new Student(125,"swagata",70));
        listStudent.add(new Student(124,"jolly",60));


        System.out.println("Lower to upper case of first char of the student name   :");

        List<String> ids= listStudent.stream().map(student-> String.valueOf(student.studentID)).collect(Collectors.toList());

        List<String> name=listStudent.stream().map(student-> {
            String str=student.name;
            String names=str.substring(0, 1).toUpperCase() + str.substring(1);
            return names;

        }).collect(Collectors.toList());

        name.forEach(System.out::println);
        System.out.print("\n");

        List<Student> nameSwagata=listStudent.stream().filter(student-> student.name.equals("swagata")).collect(Collectors.toList());

        System.out.println("All occurence of Swagata are :");
        nameSwagata.forEach(student -> {
            System.out.println(student.studentID+"   "+student.name+"   "+student.marks);
        });

       System.out.print("\n");


        Student nameFirstSwagata=listStudent.stream().filter(student-> student.name.equals("swagata")).findFirst().orElse(null);
        System.out.println("First 'Swagata' details  are  "+nameFirstSwagata.studentID+"   "+nameFirstSwagata.name+"   "+nameFirstSwagata.marks);
        System.out.print("\n");

        int marks=listStudent.stream().filter(student-> student.studentID==124).map(student -> student.marks).findAny().get();
        System.out.println("Marks of stident id '124' is "+marks);
        System.out.print("\n");

        System.out.println("Remove marks property :");
        List<Students> studentwithoutmarks= listStudent.stream().map(student -> {return new Students(student.studentID, student.name);}).collect(Collectors.toList());
        studentwithoutmarks.forEach(student -> {
            System.out.println(student.studentID+"   "+student.name);
        });


        List<Marks> listMarks=new ArrayList<>();
        listMarks.add(new Marks(123,70,50,60));
        listMarks.add(new Marks(125,80,70,90));
        listMarks.add(new Marks(124,40,60,90));
        listMarks.add(new Marks(126,40,60,95));


        System.out.print("\n");
        System.out.println("Get total of each students :");

        List<Marks> totalval=listMarks.stream().map(mark-> {
            mark.setTotal(mark.marks1 + mark.marks2 + mark.marks3);
            return mark;
        }).collect(Collectors.toList());
        totalval.forEach(mark -> {
            System.out.println(mark.studentID+"   "+mark.marks1+ " "+mark.marks2+ "  "+mark.marks3+"   "+mark.total);
        });

        System.out.print("\n");
        System.out.println("Top 3 student list");
        List<Marks> sortedList= totalval.stream().sorted(Comparator.comparingInt(Marks::getTotal).reversed()).limit(3).collect(Collectors.toList());
        sortedList.forEach(mark -> {
            System.out.println(mark.studentID+"   "+mark.marks1+ " "+mark.marks2+ "  "+mark.marks3+"   "+mark.total);
        });





    }
}
