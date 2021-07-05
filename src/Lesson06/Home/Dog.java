package Lesson06.Home;

import Lesson06.Home.Model.Animal;

public class Dog extends Animal{

    public static int countDog = 0;

    public Dog(String name, String color, int age, float maxRun, float maxSwim) {
        super(name, color, age, maxRun, maxSwim);
        ++countDog;
    }



}
