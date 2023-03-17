import java.util.Comparator;
public class Person implements Comparable<Person>  {
    private String name;
    private int age;
    private boolean married;

    public Person() {
    }

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    @Override
    public String toString() {
        return  name + ", " + age + ", " + married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public int compareTo(Person o) {
        //  return this.age-o.age;
        return this.name.compareTo(o.name);
    }
}
class PersonAgeComparator implements Comparator<Person>{
    public int compare(Person o1,Person o2){
        return o1.getAge()-o2.getAge();
    }
}
