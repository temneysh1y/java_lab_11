package org.example.commit3;

import org.example.Animal;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " чирикает.");
    }

    @Override
    public void move() {
        System.out.println(name + " прыгает по ветке.");
    }
}

