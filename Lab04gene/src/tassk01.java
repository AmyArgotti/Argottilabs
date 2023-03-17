//1
import java.util.Arrays;

public class tassk01 {
    public static void main(String[] args) {

        Integer[]a = {1,2,3,4,5};
        String []s= {"yes","no", "i don't know ","maybe"};
        Double[]x= {Math.PI,Math.E,-5.1234,9.8,0.0};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(x));

        swap(a,0,1);
        swap(s,0,3);
        swap(x,1,2);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(x));

        Integer[]b= removeElement(a,2);//1,2, 4,5
        String[]ss= removeElement(s,3);//yes,no,i dont know
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(ss));

    }
    static <T> T[] removeElement(T[]a,int ind ){
        //  T[]result=  (T[])new Object[a.length-1];
        T[]res= Arrays.copyOf(a,a.length-1);
      /*  for (int i = ind; i <res.length ; i++) {
            res[i]=a[i+1];
        }*/
        System.arraycopy(a,ind+1,res,ind,a.length-ind-1);
        return res;
    }

    static <T>void swap(T[]a,int i,int j){
        T b= a[i];
        a[i]= a[j];
        a[j]= b;
    }
    public static <T>void print (T []a){
        for (int i = 0; i <a.length ; i++) {
            System.out.println("elment no"+i+"equle"+a[i]);
        }
    }
}