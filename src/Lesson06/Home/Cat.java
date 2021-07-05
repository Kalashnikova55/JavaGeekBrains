package Lesson06.Home;

import Lesson06.Home.Model.Animal;

public class Cat extends Animal {

    public static int countCat = 0;

    public Cat(String name, String color, int age, float maxRun, float maxSwim) {
        super(name, color, age, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    public int swim(float distance) {
        return Animal.SWIM_NONE;
    }
}
