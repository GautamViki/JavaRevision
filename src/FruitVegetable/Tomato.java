package FruitVegetable;

public class Tomato implements Fruit, Vegetables {
    public static void main(String[] args) {
        Fruit fruit = new Tomato();
        System.out.println("Fruit");
        fruit.hasPeel();
        fruit.hasRoot();

        Vegetables vegetables = new Tomato();
        System.out.println("Vegetable");
        vegetables.hasPeel();
        vegetables.hasRoot();
    }

    @Override
    public void hasPeel() {
        System.out.println("It has peel");
    }

    @Override
    public void hasRoot() {
        System.out.println("It has root");
    }
}
