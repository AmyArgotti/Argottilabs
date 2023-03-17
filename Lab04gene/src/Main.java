import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //    Pair<Integer,Integer>a=


        ArrayList b= new ArrayList();
        b.add("jstdh");
        b.add(12);
        b.add(23.4);
        b.add(true);


        ArrayList<String>a=new ArrayList<>();
        a.add("qqqqq");
        a.add("q");
        a.add("qq");
        a.add("qqq");
        a.add("11111qqqqq");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        for (int i = 0; i <a.size() ; i++) {
            a.set(i,"1000" );
            System.out.println(a.get(i));
        }
        System.out.println(a);



    }
}