import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil<T> {

    public ArrayList<T> createArray(T[] array){
        ArrayList<T> ar = (ArrayList<T>) Arrays.asList(array);
        return ar;
    }
    public void replaceTwoElements(T[] array, int i, int j){
       T temp;
       temp= array[i];
       array[i] = array[j];
       array[j]=temp;
    }
}
