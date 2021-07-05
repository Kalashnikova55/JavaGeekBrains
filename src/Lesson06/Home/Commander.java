package Lesson06.Home;

import Lesson06.Home.Model.Animal;

public class Commander {
    public static void main(String[] args) {
        String tempWinEvent = " это получилось";
        String tempLossEvent = " это не получилось";
        String eventName;
        String eventResult;


        Cat cat = new Cat("Кот", "Коричневый", 3, 200, 0);
        Dog dog = new Dog("Собака", "Белая", 6, 500, 10);

        Animal[] animals = {cat, dog};
        float runLength = 250;
        float swimLength = 8;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getColor() + " " + animals[i].getName() + " может ";

            eventName = "пробежать на " + animals[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "проплыть на " + animals[i].getMaxSwim() + " м. Попытка проплыть на ";

            if (swimResult == Animal.SWIM_NONE) {
                eventResult = " это не получилось, так как не умеет плавать";
                result(nameString, eventName, swimLength, eventResult);
            }

            if (swimResult == Animal.SWIM_OK) {
                eventResult = tempWinEvent;
                result(nameString, eventName, swimLength, eventResult);
            }

            if (swimResult == Animal.SWIM_FAIL) {
                eventResult = tempWinEvent;
                result(nameString, eventName, swimLength, eventResult);
            }

        }
        System.out.println("Всего животных = " + Animal.countAnimal + " > из них котов = " + Cat.countCat + " > и собак = " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);
    }
}

