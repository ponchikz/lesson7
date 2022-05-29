public class Cat {
    private String name;
    private int appetite;
    private boolean eat = false;
    public Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
    }
    public void info() {
        System.out.println("��� �� ������ " + name + " � ��������� " + appetite);
        if (eat) {
            System.out.println("�� �� �������");
    } else {
            System.out.println("�� �������");
        }
    }
    public void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            eat = true;
        }
    }
}
