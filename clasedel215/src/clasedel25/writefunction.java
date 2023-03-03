package clasedel25;

public class writefunction {
    public static void main(String[] args) {
        printHello(3);
        System.out.println("End of the program");
    }
    public static void printHello(int n ){//aqui indica cuantas veces se repite
        if(n==0) return;

        System.out.println(n+ " Hello! ");
        printHello(n-1);      // llamada recursiva
        System.out.println(n+ " Byeeee");

    }

}
