package Lesson06;

import Lesson06.Models.MyHeros;

public final class Archer extends MyHeros {

    public Archer(String name, int health, int power, float attack) {
        super(name, health, power, attack);
    }

    @Override
    public void sleep() {
        System.out.println("sleep-sleep-sleep");
    }
}
