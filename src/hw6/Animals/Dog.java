package hw6.Animals;

public class Dog extends Animal {
    static int dogCount = 0;
    public Dog(String name, String color){
        super(name, color);
        dogCount++;
    }
    @Override
    public void run(int distance){
        System.out.printf("%s пробежал %d метров\n",this.name, distance);
    }
    @Override
    public void swim(int distance){
        System.out.printf("%s проплыл %d метров\n",this.name, distance);
    }
    public static void getDogCount(){
        System.out.printf("Всего собак: %d\n",dogCount);
    }
}
