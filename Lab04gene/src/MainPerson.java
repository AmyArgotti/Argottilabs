import java.util.Arrays;

public class MainPerson {
    public static void main(String[] args) {
        Person a= new Person("vasey",34,true);
        Person b= new Person("Zdina",14,false);
        if (a.compareTo(b)==0) {
            System.out.println("a==b ");
        } else if (a.compareTo(b)<0) {
            System.out.println("a small than b, b alfabet");

        }else {
            System.out.println("a bigger than b , b alfabet");
        }
        Person[] people= {
                new Person("vasya",34,true),
                new Person("Zdina",14,false),
                new Person("petya",24,false),
        };
        Arrays.sort(people);
        System.out.println();

        PersonAgeComparator comparator= new PersonAgeComparator();
        if (comparator.compare(a,b)==0) {
            System.out.println("a==b ");
        } else if (comparator.compare(a,b)<0) {
            System.out.println("a small than b, b alfabet");

        }else {
            System.out.println("a bigger than b , b alfabet");
        }
        Arrays.sort(people,comparator);
        System.out.println(Arrays.toString(people));
    }
}