public class Test {
    public static void main(String[] args) {
        FruitBox<String, Banana> bananaBox = new FruitBox<>("banana", new Banana());
        bananaBox.getFruitObj().printClass();

        FruitBox<String, Apple> appleBox = new FruitBox<>("apple", new Apple());
        appleBox.getFruitObj().printClass();

        FruitBox<String, Fruit> fruitBox = new FruitBox<>("fruit", new Fruit());
        fruitBox.getFruitObj().printClass();

        VegetableBox<String, Cabbage> cabbageVegetableBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageVegetableBox.getVegetableObj().printClass();
    }
}