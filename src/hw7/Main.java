package hw7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat("Barsik", 10),
                new Cat("Пушок", 10),
                new Cat("Снежок", 5),
                new Cat("Гамлет", 25),
                new Cat("Велес", 1),
                new Cat("Рембо", 30),
                new Cat("Персик", 2),};
        Plate plate = new Plate(75);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        System.out.println("В тарелке осталось "+ plate.getAmountFood()+" корма\n");
        plate.addFood(50);

        //после того как доабвили корм, второй раз даем ее котам
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

    }
}
