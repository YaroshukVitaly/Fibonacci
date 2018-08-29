package by.yaroshuk.fibonacci;

import java.util.Scanner;

public class Sposob2 {
    public void sposobArray() {
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
        System.out.println("Время выполнения - " + hour + "." + min + "." + sek);
    }


}
