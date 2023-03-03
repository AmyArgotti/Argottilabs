package clasedel03mar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        int x = scanner.nextInt();
//        System.out.println(1 / (x - 1));



        try{
            int x= scanner.nextInt();
            System.out.printf("when x= %d y= 1/(x-1) =%.3f",x,1/(x-1));

        }catch (InputMismatchException e){
            System.out.println(" U enter teh num");
        }catch (ArithmeticException e){
            System.out.println(" not 0");
        }catch (Exception e){
            System.out.println("no problem");
            e.printStackTrace();
        }finally {
            System.out.println("Все, расчет завершет");

        }

    }
}