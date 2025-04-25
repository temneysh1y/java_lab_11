package org.example.commit2;

import org.example.Swimmable;

public class Dog extends Mammal implements Swimmable {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println(name + " плывёт.");
    }
}
