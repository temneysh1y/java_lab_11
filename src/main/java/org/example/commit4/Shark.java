package org.example.commit4;

import org.example.Predator;
import org.example.Swimmable;

public class Shark extends Fish implements Swimmable, Predator {
    public Shark(String name, int age) {
        super(name, age);
    }


    public void swim() {
        System.out.println(name + " плывёт быстро.");
    }

  
    public void hunt() {
        System.out.println(name + " охотится в воде.");
    }
}

