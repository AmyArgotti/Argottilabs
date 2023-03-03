import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {-45, 9,78,6,-12, 67};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Person[] persons= {
                new Person("Kate", 1,true),
                new Person("Dan", 1,true),
                new Person("a", 1,true),
                new Person("b", 1,true),
        };
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Person oldest = persons[0];
        for(int i=1 ; i< persons.length; i++){
             if (persons[i].compareTo(oldest)>0)
                 oldest = persons[i];
         }
        System.out.println("the oldest one is= "+ oldest);

    }
}