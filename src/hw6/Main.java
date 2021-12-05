package hw6;

import hw6.Animals.Cat;
import hw6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Бэлый");
        Cat cat2 = new Cat("Мурзик", "Синий");
        Cat cat3 = new Cat("Черныш", "Красный");
        Dog dog1 = new Dog("Шарик", "черный");
        Dog dog2 = new Dog("Ухо", "рыжий");
        Dog dog3 = new Dog("Собакакусака", "радужный");
        dog1.run(200);
        cat1.run(300);
        dog1.swim(50);
        cat1.swim(300);
        Cat.getCatCount();
        Dog.getDogCount();
    }
}
