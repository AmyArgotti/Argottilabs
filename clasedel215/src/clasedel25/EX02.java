package clasedel25;

import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    readAndWrite(scanner);

    }
    public static void readAndWrite(Scanner sc){



        System.out.print("next number = ");
        int x = sc.nextInt(); //entrada del numero
        if (x==0) return; //comprobacion en 0
        readAndWrite(sc); //llamada recursiva
        System.out.println(x); //salida del numero
    }
}
