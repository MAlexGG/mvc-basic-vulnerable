package com.pet_adoption.model;

public class Dog {

    private String name;
    private int age;
    private boolean isAdopted;

    public Dog(){}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAdopted = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsAdopted() {
        return this.isAdopted;
    }

    public void setIsAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }
}
