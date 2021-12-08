package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate){
        if (satiety){
            System.out.println("Кот "+name+ " не кушает, так как сыт");
            return;
        }
        if(plate.decreaseFood(appetite)){
            satiety=true;
            System.out.println("Котэ "+name+ " съел "+ appetite+ " корма и наелся");
        }else {
            System.out.println("Коту "+name+ " нужно "+ appetite+" корма, но в тарелке "+ plate.getAmountFood()+ " корма. Кот голоден");
        };
    }
}
