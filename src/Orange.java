public class Orange<T extends Fruit> extends Fruit{
    private float weight;

    public Orange(float weight){
        this.weight=weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
