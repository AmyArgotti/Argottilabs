package clasedel25;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fib(30));

    }
    public static int fib(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return fib(n-2) + fib(n-1); //la respuesta va a ser el resultado en la posicion del calculo de clasedel25.fibonacci
    }

}
