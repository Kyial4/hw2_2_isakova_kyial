package com.company;

public class Wife extends Family implements Printable{
private String work;

    public Wife(int age, String name, String work) {
        super(age, name);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void print() {
        System.out.println("Wife: "+work);

    }
}
