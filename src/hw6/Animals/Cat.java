package hw6.Animals;

public class Cat extends Animal{
    static int catCount = 0;
    public Cat(String name, String color){
        super(name, color);
        catCount++;
    }
    @Override
    public void run(int distance){
        System.out.printf("%s пробежал %d метров\n",this.name, distance);
    }
    @Override
    public void swim(int distance){
        System.out.printf("%s не умеет плавать, так как он кот\n",this.name);
    }
    public static void getCatCount(){
        System.out.printf("Всего котов: %d\n",catCount);
    }

}
