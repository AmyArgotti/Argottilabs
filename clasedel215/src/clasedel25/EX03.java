package clasedel25;

import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(x(1));
        System.out.println(x(2));
        System.out.println(x(5));



    }
    public static double x(int n){

        if (n==0) return 0;
        return Math.sqrt(2 + x(n-1));
    }
}