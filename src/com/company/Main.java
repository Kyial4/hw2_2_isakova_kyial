package com.company;

public class Main {

    public static void main(String[] args) {
        Family[] family={ createObject ("Wife"),
                createObject ("Husband"), createObject ("Baby")};
        for (int i = 0; i < family.length ; i++) {
            family[i].print();
            
        }
        }

    private static Family createObject(String classname) {
        Husband husband = new Husband(52,"Roman","qa testing");
        Wife wife = new Wife(50,"Masha","housewife");
        Baby baby = new Baby(1,"Edil","playing");

        switch (classname) {
            case "Husband":
                return husband;
            case "Wife":
                return wife;
            case "Baby":
                return baby;
        }
        Family[] familys = {
                husband,wife,baby};
        return null;
    }

}

