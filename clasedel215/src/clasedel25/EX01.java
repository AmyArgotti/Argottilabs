package clasedel25;

public class EX01 {
    public static void main(String[] args) {
        result(5);
    }

    public static void result(int n){
        if (n==0) return ;
        result(n-1);
        System.out.println(n+" the square = "+Math.pow(n,2));


    }
}
