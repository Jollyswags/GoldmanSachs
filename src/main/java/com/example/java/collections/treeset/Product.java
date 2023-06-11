package com.example.java.collections.treeset;

public class Product implements Comparable<Product>{
    String name;
    String id;
    String description;
    Product(String name, String id, String description){
        this.name=name;
        this.id=id;
        this.description=description;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getDescription(){
        return this.description;
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

       Product p = (Product) o;
        return (this.getName()==p.getName()) && (this.getId()==p.getId()) && (this.getDescription()==this.getDescription());
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + Integer.parseInt(getId());
        return result;
    }
    public int compareTo(Product prod)
    {
        return this.id.compareTo(prod.id);
    }
}
