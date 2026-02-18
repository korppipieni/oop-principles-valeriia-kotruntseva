package com.company.professions;

public class Person {
    private String fullName;

    public Person(String fullName){
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }

}
