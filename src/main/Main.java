package main;

import animals.Cat;
import animals.Cow;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Pif";
        dog.yo = 1;
        dog.color = "black";

        Cat cat = new Cat();
        cat.name = "Mia";
        cat.yo = 2;
        cat.color = "White";

        Cow cow = new Cow();
        cow.name = "Maia";
        cow.yo = 1;
        cow.color = "Black and white";

        System.out.println("\tDog"+"\nName: " + dog.name + "\nYears old: " + dog.yo + "\nColor: " + dog.color);
        System.out.println("\tCat"+"\nName: " + cat.name + "\nYears old: " + cat.yo + "\nColor: " + cat.color);
        System.out.println("\tCow"+"\nName: " + cow.name + "\nYears old: " + cow.yo + "\nColor: " + cow.color);
    }
}