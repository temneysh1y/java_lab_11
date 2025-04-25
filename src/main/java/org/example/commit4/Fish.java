package org.example.commit4;

import org.example.Animal;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " издает пузыри.");
    }

    @Override
    public void move() {
        System.out.println(name + " плывёт.");
    }
}
