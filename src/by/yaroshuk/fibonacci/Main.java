package by.yaroshuk.fibonacci;

import java.util.Scanner;

public class Main {


       public static void main(String[] args) {
        System.out.println("Введите 1 или 2 для выбора метода");
        Scanner scannerMetod = new Scanner(System.in);
        int metod = scannerMetod.nextInt();

        if (metod == 1){
            Sposob1 sposob1 = new Sposob1();

            sposob1.sposobСycle();

        }else if (metod == 2){
           Sposob2 sposob2 = new Sposob2();
           sposob2.sposobArray();

        }else System.out.println("Вы ввели некорректный № метода");

    }

}
