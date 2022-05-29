public class App {

    public static void main(String[] args) {
        Cat cat1 = new Cat("������", 100);
        Cat cat2 = new Cat("���", 55);
        Cat cat3 = new Cat("�����", 50);

        Cat[] cats = {cat1, cat2, cat3};
        Plate plate = new Plate(200);//�������� � ������� �����, � ������� �������� ����� ���� �� ��������� ��� � �������

        //������� ������ ����� � ������� � ����, ��������� ���� ����� �������� �� ���� �������
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }
}
