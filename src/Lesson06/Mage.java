package Lesson06;

import Lesson06.Models.MyHeros;

public class Mage extends MyHeros {

    public Mage(String name, int health, int power, float attack) {
        super(name, health, power, attack);
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
