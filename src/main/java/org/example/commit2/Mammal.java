package org.example.commit2;

import org.example.Animal;

public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " издает звук.");
    }

    @Override
    public void move() {
        System.out.println(name + " бежит.");
    }
}

