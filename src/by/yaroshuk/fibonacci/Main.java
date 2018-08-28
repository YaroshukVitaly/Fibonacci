package by.yaroshuk.fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите 1 или 2 для выбора метода");
        Scanner scannerMetod = new Scanner(System.in);
        int metod = scannerMetod.nextInt();
        if (metod == 1){
            long start = System.currentTimeMillis();
            System.out.println("Введите пораметр i!");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            int n0 = 1;
            int n1 = 1;
            int n2;
            System.out.println("Вывод n чилел Фибоначи через цыкл");
            System.out.print(n0+" "+n1+" ");
            for(int n = 0; n < i-2; n++){
                n2=n0+n1;
                System.out.print(n2+" ");
                n0=n1;
                n1=n2;
            }
            System.out.println();
            long finish = System.currentTimeMillis();
            long time = finish - start;
            long sek = time / 1000;
            long min = sek / 60;
            long hour = min / 60;
            System.out.println("Время выполнения - " + hour + "." + min + "." +  sek);


        }else if (metod == 2){
            long start = System.currentTimeMillis();
            System.out.println("Введите пораметр i!");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();

            int[] f = new int[i];
            f[0] = 1;
            f[1] = 1;
            for (int n = 2; n < i; ++n) {
                f[n] = f[n - 1] + f[n - 2];
            }
            System.out.println("Вывод n чилел Фибоначи через создание массива: ");

            for (int n = 0; n < i; ++n) {
                System.out.print(f[n] + " ");
            }
            System.out.println();
            long finish = System.currentTimeMillis();
            long time = finish - start;
            long sek = time / 1000;
            long min = sek / 60;
            long hour = min / 60;
            System.out.println("Время выполнения - " + hour + "." + min + "." +  sek);


        }else System.out.println("Вы ввели некорректный № метода");

    }
}
