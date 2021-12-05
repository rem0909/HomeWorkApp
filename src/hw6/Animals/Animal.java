package hw6.Animals;

 abstract class Animal {
    protected String name;
    protected String color;

    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void run(int distance){
        System.out.println("Animal running "+ distance+" m.");
    }
    public void swim(int distance){
        System.out.println("Animal swiming "+ distance+" m.");
    }
}
