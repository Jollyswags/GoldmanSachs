package com.example.java.collections.treemap;


public class Employee implements Comparable<Employee>{
    String name;
    String id;
    Employee(String name, String id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Employee e = (Employee) o;
        return (this.getName()==e.getName()) && (this.getId()==e.getId());
    }
    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + Integer.parseInt(getId());
        return result;
    }
    @Override
    public int compareTo(Employee e)
    {
        return this.id.compareTo(e.id);
    }

}
