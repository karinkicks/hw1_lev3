import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Box<T extends Fruit> {
    ArrayList<Fruit<T>> boxOfFruit;

    public void add(Fruit<T> fruit){
       if (boxOfFruit==null){
           boxOfFruit = new ArrayList<>();
           boxOfFruit.add(fruit);
           return;
       }
       boxOfFruit.add(fruit);
    }

    public float getWeight(){
        AtomicReference<Float> sum= new AtomicReference<>((float) 0);
        boxOfFruit.forEach(fruit -> {
            sum.updateAndGet(v -> new Float((float) (v + fruit.getWeight())));
        });
        return sum.get();
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxOfFruit=" + boxOfFruit +
                '}';
    }

    public boolean compare(Box<? extends Fruit> box){
        if(box.getWeight()==this.getWeight()){
            return true;
        }
        return false;
    }

    public void pourOver(Box<T> box){
        boxOfFruit.forEach(fruit -> {
            box.add(fruit);
        });
        boxOfFruit.clear();
    }

}
