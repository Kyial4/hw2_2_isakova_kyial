package com.company;

public class Husband extends Family implements Printable{
    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Husband(int age, String name, String work) {
        super(age, name);
        this.work = work;
    }

    @Override
    public void print() {
        System.out.println("Husband: "+ work);

    }
}
