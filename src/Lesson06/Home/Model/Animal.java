package Lesson06.Home.Model;

public abstract class Animal {

    public static final int SWIM_FAIL = 0;
    public static final int SWIM_OK = 1;
    public static final int SWIM_NONE = -1;

    protected String name;
    protected String color;
    protected int age;
    protected boolean isAlive;
    private float maxRun;
    private float maxSwim;

    public static int countAnimal = 0;

    public Animal(String name, String color, int age, float maxRun, float maxSwim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isAlive = true;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++countAnimal;
    }

    public boolean isAlive() {
        return isAlive;
    }


    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public float getMaxRun() {
        return  this.maxRun;
    }

    public float getMaxSwim() {
        return this.maxSwim;
    }

    public boolean run(float distance) {
        return (distance <= maxRun);
    }

    public int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }


}
