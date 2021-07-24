public class FruitBox<K, T extends Fruit> {
    private K fruitName;
    private T fruitObj;

    public FruitBox(K fruitName, T fruitObj) {
        this.fruitName = fruitName;
        this.fruitObj = fruitObj;
    }

    public K getFruitName() {
        return fruitName;
    }

    public void setFruitName(K fruitName) {
        this.fruitName = fruitName;
    }

    public T getFruitObj() {
        return fruitObj;
    }

    public void setFruitObj(T fruitObj) {
        this.fruitObj = fruitObj;
    }
}