public class VegetableBox<E, R extends Vegetable> {
    private E vegetableName;
    private R vegetableObj;

    public VegetableBox(E vegetableName, R vegetableObj) {
        this.vegetableName = vegetableName;
        this.vegetableObj = vegetableObj;
    }

    public E getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(E vegetableName) {
        this.vegetableName = vegetableName;
    }

    public R getVegetableObj() {
        return vegetableObj;
    }

    public void setVegetableObj(R vegetableObj) {
        this.vegetableObj = vegetableObj;
    }
}