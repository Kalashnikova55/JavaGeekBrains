package Lesson05.HomeCode;

public class Homework05 {
    public static void main (String[] args) {
        Worker worker1 = new Worker("Kalashnikova", "Anastasia", "Andreevna", "tester", "nastykalach@yandex.ru", "89151099525", 30000, 1999);

        Worker[] office = {
                worker1,
                new Worker("Ivanov", "Ivan", "Ivanovich", "engineer", "ivivan@yandex.ru", "89253876549", 30000, 1986),
                new Worker("Shavinskaya", "Nika", "Vasilyevna", "HR", "nika.shavinskaya@gmail.ru", "89160438746", 50000, 1975),
                new Worker("Kondukov", "Evgeniy", "Michaylovich", "consultant", "ev.kondukov@outlook.com", "89153876947", 60000, 1996),
                new Worker("Yovovich", "Mila", "Vitalyevna", "actress", "milaya@yandex.ru", "89167894638", 100000, 1968),
                new Worker("Denisov", "Kirill", "Andreevich", "IT developer", "kir.denisov98@yahoo.com", "89254986407", 70000, 1984),
        };

        officeInfo(office);
        System.out.println("********************");
        olderThanAge(office, 40);
    }


    public static void olderThanAge(Worker[] office, int age) {
        for(int i = 0; i < office.length; i++) {
            if (office[i].getAge() > age) {
                System.out.println(office[i].getFullInfo());
            }
        }
    }

    public static void officeInfo(Worker[] office) {
        System.out.println("All people: ");
        for (int i = 0; i < office.length; i++) {
            System.out.println((i + 1) + " " + office[i].getFullInfo());
        }

    }
}
