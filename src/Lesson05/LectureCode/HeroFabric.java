package Lesson05.LectureCode;

import Lesson05.LectureCode.Hero;

public class HeroFabric {

    public static void main (String[] args) {
        Hero hero1 = new Hero("Mario", 5, 25, 15.98f);
        Hero hero2 = new Hero("Nike", 6,99, 16.79f );

 //       hero1.name = "Mario";
 //       hero1.health = 3;
 //       hero1.age = 25;
 //       hero1.speed = 15.98f;

        System.out.println("My name is " + hero1.getName());
//        System.out.println("My health is " + hero1.getHealth);
//        System.out.println("My age is " + hero1.getAge);
//        System.out.println("My speed is " + hero1.getSpeed);
//        System.out.println("_______________");
//
  hero1.setName("Pablo");
  System.out.println("My name is " + hero1.getName());

        hero1.run();
        hero1.jump();
        hero1.speak();

        hero1.cap.color = "White";
        hero1.costume.size = 20;

        System.out.println("Cap hero " + hero1.getName() + " color is " + hero1.cap.color);
        System.out.println("Count legs: " + hero1.legs.count);
    }


}
