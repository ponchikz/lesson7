public class Cat {
    private String name;
    private int appetite;
    private boolean eat = false;
    public Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
    }
    public void info() {
        System.out.println("Кот по кличке " + name + " с аппетитом " + appetite);
        if (eat) {
            System.out.println("Он не голоден");
    } else {
            System.out.println("Он голоден");
        }
    }
    public void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            eat = true;
        }
    }
}
