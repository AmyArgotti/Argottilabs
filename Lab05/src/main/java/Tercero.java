import java.util.ArrayList;
import java.util.Collections;

public class Tercero {
    public static void main(String[] args) {
        double[] arr = {0.097, 0.565, 0.656, 0.1234, 0.665, 0.3434};
        int n = arr.length;

        double[] sortedArr = bucketSort(arr, n);

        for (double num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    public static double[] bucketSort(double[] arr, int n) {
        ArrayList<Double>[] bucket = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Double>();
        }

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(bucket[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                arr[index] = bucket[i].get(j);
                index++;
            }
        }

        return insertionSort(arr);
    }

    public static double[] insertionSort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}