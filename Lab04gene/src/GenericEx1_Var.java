public class GenericEx1_Var {
    public static void main(String[] args) {
        print("kate",5);
        print(Math.PI,3);
        print(10000,10);
        print (true,7);
        System.out.println(sum(2L,1000.55555));
        System.out.println(sum(2,23));
        //  System.out.println(sum("sdsject",23.67));


    }
    public static void print(String str,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(str);

        }
    }
    public static <T> void print(T value,int n){
        //  T a= value;
        for (int i = 0; i < n; i++) {
            System.out.println(value);
        }
    }

    public static <T extends Number, U extends Number>double sum(T a, U b){
        return a.doubleValue()+b.doubleValue();
    }

}
