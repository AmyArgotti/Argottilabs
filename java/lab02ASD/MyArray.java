package lab02ASD;

import java.util.ArrayList;

public class MyArray {
    private int length;
    private ArrayList<Integer> array;

    // if you input just the array to take values of the length will be the same
    // also the values will be set to a ArrayList
    public MyArray(Integer ...array){
        this.length = array.length;
        this.array = new ArrayList<>();
        for(Integer i: array){
               this.array.add(i);
        }
    }

    // create a total random array with random length and random items
    public MyArray(){
        this.length = (int)(Math.random() * 50);
        this.array = new ArrayList<>();
        fillWithRandomNumbers();
    }

    private MyArray(ArrayList<Integer> arr){
        this.array = arr;
        this.length = arr.size();
    }

    // if there is just the length given the ArrayList will have the values generated by random numbers from 1 to 100
    public MyArray(int length){
        this.length = length;
        this.array = new ArrayList<>();
        fillWithRandomNumbers();
    }

    // return an array with the sum of the elements of the two arrays
    // the two arrays must have the sale length
    public static MyArray createArray(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            int value = a.get(i) + b.get(i);

            result.add(value);
        }

        return new MyArray(result);
    }

    public static boolean areSimilar(MyArray a, MyArray b){
        if(a.getLength() != b.getLength()){
            return false;
        }

        for (int i = 0; i < a.getLength(); i++) {
            if(a.getByIndex(i) != b.getByIndex(i)){
                return false;
            }
        }

        return true;
    }

    // random items on the array from 1 to 100
    public void fillWithRandomNumbers(){
        for (int i = 0; i < this.length; i++) {
            int item = (int)(Math.random() * 100);
            this.array.add(item);
        }
    }

    //fill with restrictions
    public void fillWithRandomNumbers(int from, int to){
        for (int i = from; i < this.length; i++) {
            int item = 0;
            while(item >= from){
                item = (int)(Math.random() * to);
            }
            this.array.add(item);
        }
    }

    public Integer getMaxValue(){
        Integer maxVal = this.array.get(0);

        for (Integer i: this.array) {
            if(i > maxVal){
                maxVal = i;
            }
        }

        return maxVal;
    }

    public Integer getMinValue(){
        Integer minValue = this.array.get(0);

        for (Integer i: this.array) {
            if(i < minValue){
                minValue = i;
            }
        }

        return minValue;
    }

    public Integer getByIndex(int i){
        return this.array.get(i);
    }

    // returns the last index of the value, if the result is -1 that means no index for the value given was finded
    public Integer getLastIndexOf(int value){
        int result = -1;
        for (int i = 0; i < this.length; i++) {
            int currentValue = this.array.get(i);
            if(currentValue == value){
                result = i;
            }
        }

        return result;
    }

    // gives the first index that is finded
    public Integer getIndexOf(int value){
        int result = -1;
        for (int i = 0; i < this.length; i++) {
            int currentValue = this.array.get(i);
            if(currentValue == value){
                result = i;
                break;
            }
        }

        return result;
    }

    public Integer getIndexOfMinValue(){
        int minValue = getMinValue();
        return this.getIndexOf(minValue);
    }

    public MyArray getArrayOfPositives(){
        ArrayList<Integer> result = new ArrayList<>();

        for(Integer i: this.array){
            if(i > 0){
                result.add(i);
            }
        }
        return new MyArray(result);
    }

    public Integer sumAll(){
        Integer result = 0;

        for(Integer item : this.array){
            result += item;
        }
        return result;
    }

    public void replace(int index, int newValue){
        this.array.remove(index);
        this.array.add(index, newValue);
    }

    public int getLength() {
        return length;
    }

    public Integer searchForItem(int value){
        for(Integer val : this.array){
            if(val == value){
                return getIndexOf(val);
            }
        }
        return -1;
    }

    public Integer binarySearch(int value, int begin, int end){

        if(end >= begin){
            int mid = begin + (end - begin) / 2;

            if(this.array.get(mid) == value){
                return  mid;
            }
            if(this.array.get(mid) > value){
                return binarySearch(value, begin, mid - 1);
            }
            return binarySearch(value, begin + 1, end);
        }

        return -1;
    }

    public Integer binarySearch(int value){
        return binarySearch(value, 0, this.length -1);
    }

    public boolean isSorted(){
        Integer acumulator = this.array.get(0);
        boolean result = false;

        for(int i = 1; i < this.length; i++) {
            Integer current = this.array.get(i);

            if(acumulator > current){
                result = true;
            }
            else{
                result = false;
            }
            acumulator = current;
        }
        return result;
    }

    public void printArray(){
        System.out.print("[");
        for (int i = 0; i < this.length; i++) {
            System.out.print(this.array.get(i));
            if(i == (this.length -1 )){
                continue;
            }
            System.out.print(", ");
        }

        System.out.print("]");
        System.out.println("");
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    // VARIANT 4
    //
    //- Метод для циклического сдвига элементов вектора на заданное число позиций влево
    //- Метод для проверки того, что в массиве есть два рядом стоящих отрицательных числа
    //- Метод для сортировки методом Comb sort

    public boolean areAdjacentNegatives(){
        for (int i = 0; i < this.length - 1; i++) {
            Integer current = this.array.get(i);
            if(i + 1 == this.length){
                continue;
            }
            Integer actual = this.array.get(i + 1);
            if(current < 0 && actual < 0){
                return true;
            }

        }

        return false;
    }

    public void combSort() {
        int n = this.length;

        // initialize gap
        int gap = n;
        boolean swapped = true;

        while (gap != 1 || swapped == true) {
            // Find next gap
            gap = getNextGap(gap);

            // check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i = 0; i < n - gap; i++) {
                if (this.array.get(i) > this.array.get(i + gap)) {
                    // Swap arr[i] and arr[i+gap]
                    int temp = this.array.get(i);
                    this.replace(i, this.array.get(i + gap));
                    this.replace(i + gap, temp);

                    // Set swapped
                    swapped = true;
                }
            }
        }
    }

    // the arguments required refers to the index of the array from index, to index
    public void moveElementFrom(int from, int to){
        Integer a = getByIndex(from);
        Integer b = getByIndex(to);

        this.replace(to, a);
        this.replace(from, b);
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "length=" + length +
                ", array=" + array +
                '}';
    }

    // To find gap between elements
    private int getNextGap(int gap)
    {
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }
}
