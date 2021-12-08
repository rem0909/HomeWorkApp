package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (appetite <= 0) {
            return false;
        }
        if (this.food - appetite < 0) {
            return false;
        } else {
            this.food -= appetite;
            return true;
        }
    }

    public void addFood(int food) {
        if (food > 0) {
            this.food += food;
            System.out.println("Добавили "+food +"корма, в тарелке "+this.food+ " корма");
        }
    }
    public int getAmountFood(){
        return food;
    }
}
