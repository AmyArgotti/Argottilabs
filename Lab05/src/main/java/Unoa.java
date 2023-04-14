import java.util.Arrays;

public class Unoa {
    public static int[] countingSort(int[] arr, int key) {
        int n = arr.length;
        int[] count = new int[key + 1];
        int[] output = new int[n];

        // Contar la cantidad de elementos iguales a la clave
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Calcular la posición de cada elemento en el arreglo ordenado
        int index = 0;
        for (int i = 0; i <= key; i++) {
            for (int j = 0; j < count[i]; j++) {
                output[index] = i;
                index++;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, 2, 3, 5};
        int key = 9;

        int[] sortedArr = countingSort(arr, key);

        System.out.println(Arrays.toString(sortedArr));
    }
}