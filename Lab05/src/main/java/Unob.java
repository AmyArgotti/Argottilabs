public class Unob {
    public static int[] countingSort(int[] arr, int key) {
        int n = arr.length;
        int[] count = new int[key + 1];
        int[] output = new int[n];

        // Contar la cantidad de elementos menores o iguales que la clave
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Calcular la posición de cada elemento en el arreglo ordenado
        for (int i = 1; i <= key; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Ordenar el arreglo
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, 2, 3, 5};
        int key = 9;

        int[] sortedArr = Unob.countingSort(arr, key);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}