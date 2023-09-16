import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int a = 0;
        int b = 1;
        int c;
        int sayac = 2; //fibonacci serisinin ilk iki değeri belli olduğu için eleman değerini 2'den başlatmış olduk.

        System.out.print("Fibonacci Dizisi Kaç Elemanlı Olmalı : ");
        n = scan.nextInt();

        System.out.print(a + " ");
        System.out.print(b + " ");

        while (sayac != n) {
            sayac++;
            c = a + b;
            a = b;      //işlem ilerlediği için bir sonraki değeri bulurken sırasını ilerlettim.
            b = c;
            System.out.print(c + " ");
        }


    }
}