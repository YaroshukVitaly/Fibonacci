package by.yaroshuk.fibonacci;

import java.util.Scanner;

public class Sposob1 {
    public void sposobСycle(){
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

    }
}
