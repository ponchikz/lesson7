public class Plate {
    private int food;
    public int getFood() {
        return food;
    }
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Колличество еды в миске " + food);
    }
    public void decreaseFood(int appetite) {
        food -= appetite;
    }
}
