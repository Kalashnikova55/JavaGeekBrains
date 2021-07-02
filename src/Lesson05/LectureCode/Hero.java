package Lesson05.LectureCode;

public class Hero {
    private String name;
    private int health;
    private int age;
    private float speed;
    Cap cap = new Cap();
    Costume costume = new Costume();
    Legs legs = new Legs();

    public Hero(String name, int health, int age, float speed) {
       this. name = name;
       this.health = health;
       this.age = age;
       this.speed = speed;
    }

    public class Cap {
        String color;
        int size;
        String letter;
    }

    public class Costume {
        String form;
        int size;
        String text;
    }

    void run() {
System.out.println(name + " runs");
    }

    void jump() {
        System.out.println(name + " jumps");
    }


    void speak() {
        System.out.println(name + " speaks");
    }

    public class Legs {
        int count = 2;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }


}
