package Lesson06.Models;

public abstract class MyHeros {

    protected String name;
    protected int health;
    protected int power;
    protected float attack;
    protected boolean isAlive;

    public MyHeros(String name, int health, int power, float attack) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.attack = attack;
        this.isAlive = true;
    }

    public void speak() {
        System.out.println(name + " says Hello!");
    }

    public void dealDamage() {
        System.out.println(name + " deals damage " + attack * power + " points");
    }
    public void healSelf(int valueHp) {
        this.health += valueHp;
        System.out.println(name + " heals self " + attack * power + " points. My health now " + health);
    }

    public boolean isAlive() {
        return isAlive;
    }

    public abstract void sleep();

}
