public class Main {

    public static void main(String[] args) {
        Fruit<Orange> orangeFruit = new Orange<>(0.1f);
        Fruit<Orange> orangeFruit1 = new Orange<>(0.2f);
        Fruit<Orange> orangeFruit2 = new Orange<>(0.3f);
        Fruit<Orange> orangeFruit3 = new Orange<>(0.4f);

        Fruit<Apple> appleFruit = new Apple<>(0.1f);
        Fruit<Apple> appleFruit1 = new Apple<>(0.5f);
        Fruit<Apple> appleFruit2 = new Apple<>(5.1f);
        Fruit<Apple> appleFruit3 = new Apple<>(10.2f);

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.add(orangeFruit);
        orangeBox.add(orangeFruit1);
        orangeBox.add(orangeFruit2);
        orangeBox.add(orangeFruit3);
        System.out.println(orangeBox.toString());
        System.out.println(orangeBox.getWeight());

        appleBox.add(appleFruit);
        appleBox.add(appleFruit1);
        appleBox.add(appleFruit2);
        appleBox.add(appleFruit3);
        System.out.println(appleBox.toString());
        System.out.println(appleBox.getWeight());

        if(appleBox.compare(orangeBox)){
            System.out.println("Коробки равны");
        }else{
            System.out.println("Коробки не равны");
        }

        Box<Orange> box1 = new Box<>();

        orangeBox.pourOver(box1);
        System.out.println("Старая коробка с апельсинами "+orangeBox.toString());
        System.out.println("Новая коробка с апельсинами "+box1.toString());

    }
}
