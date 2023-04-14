import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(2);
        arr.add(9);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(5);

        ArrayList<Integer> sortedArr = countingSort(arr);

        System.out.println(sortedArr);
    }

    public static ArrayList<Integer> countingSort(ArrayList<Integer> arr) {
        int n = arr.size();
        int max = Collections.max(arr);
        int[] count = new int[max + 1];
        ArrayList<Integer> output = new ArrayList<Integer>(n);

        // Contar la cantidad de elementos iguales a la clave
        for (int i = 0; i < n; i++) {
            count[arr.get(i)]++;
        }

        // Calcular la posición de cada elemento en el arreglo ordenado
        int index = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < count[i]; j++) {
                output.add(i);
                index++;
            }
        }

        return output;
    }
}