public class Apple<T extends Fruit> extends Fruit{
    private float weight;

    public Apple(float weight){
        this.weight=weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
