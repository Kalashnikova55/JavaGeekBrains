package Lesson06;

import Lesson06.Models.MyHeros;

import java.util.Random;

public class Director {
    public static Random random = new Random();

    public static void main (String[] args) {
//        byte myByte1 = 50;
//        int myInt1 = myByte1;
//        System.out.println("myInt1 > " + myInt1);

//        int myInt2 = 50;
//        byte myByte2 = (byte) myInt2; //type casting
//        System.out.println("myByte2 > " + myByte2);

        Paladin paladin = new Paladin("Paladin", 100, 10, 12.3f);
        Archer archer = new Archer("Archer", 80, 20,29.1f);
        Mage mage = new Mage("Mage", 50, 15, 50.4f);
        Titan titan = new Titan("Titan",250, 50, 310.4f,55);

        MyHeros[] army = {archer, paladin, mage, titan};
        for (int i = 0; i < army.length; i++) {
            army[i].dealDamage();
            army[i].healSelf(random.nextInt(50));

            if(army[i] instanceof Titan) {
                Titan tmpTitan = (Titan) army[i];
                tmpTitan.blockAttack();
 //               ((Titan) army[i]).blockAttack();
            }
        }


        titan.speak();
        titan.dealDamage();
        mage.healSelf(random.nextInt(50));
        titan.healSelf(random.nextInt(50));
        titan.blockAttack();
    }
}
