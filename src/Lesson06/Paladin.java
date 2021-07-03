package Lesson06;

import Lesson06.Models.MyHeros;

public class Paladin extends MyHeros {
    protected int defense;

    public Paladin(String name, int health, int power, float attack) {
        super(name, health, power, attack);
        this.defense = 0;
    }

    public Paladin(String name, int health, int power, float attack, int defense) {
        super(name, health, power, attack);
        this.defense = defense;
    }

    @Override
    public void sleep() {
        System.out.println("sleep-sleep");
    }
}
