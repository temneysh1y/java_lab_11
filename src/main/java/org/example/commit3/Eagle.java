package org.example.commit3;

import org.example.Flyable;
import org.example.Predator;

public class Eagle extends Bird implements Flyable, Predator {
    public Eagle(String name, int age) {
        super(name, age);
    }


    public void fly() {
        System.out.println(name + " летит со скоростью 80 км/ч.");
    }

   
    public void hunt() {
        System.out.println(name + " охотится.");
    }
}
