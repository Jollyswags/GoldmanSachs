package com.example.java.java8.stream;

public class Marks {
    int studentID;
    int marks1;
    int marks2;
    int marks3;
    int total;

    Marks(int studentID, int marks1, int marks2, int marks3){
        this.studentID=studentID;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.total=total;

    }
    public void setTotal(int sum){
        this.total=sum;

    }
    public int getTotal(){
        return this.total;

    }
}
