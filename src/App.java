public class App {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Обжора", 100);
        Cat cat2 = new Cat("Том", 55);
        Cat cat3 = new Cat("Балам", 50);

        Cat[] cats = {cat1, cat2, cat3};
        Plate plate = new Plate(200);//Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку

        //Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }
}
