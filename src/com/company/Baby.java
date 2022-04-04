package com.company;

public class Baby extends Family implements Printable{
    private String hobby;

    public Baby(int age, String name, String hobby) {
        super(age, name);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void print() {
        System.out.println("Babys hobby is: "+ hobby);
    }
}
