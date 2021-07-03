package Lesson06;

public class Titan extends Paladin {

    public Titan(String name, int health, int power, float attack, int defense) {
        super(name, health, power, attack, defense);
    }
    public void blockAttack() {
        System.out.println(name + "has block damage " + defense);
    }

    @Override
    public void healSelf(int valueHp) {
        System.out.println(name + " doesn't heal himself");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println(name + " says something");
    }
}
