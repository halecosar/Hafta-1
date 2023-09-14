import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 0'dan girilen sayıya kadar  3 ve 4'e tam bölünen sayıların ortalamasını hesaplayınız.

        int x;
        int sum = 0;
        int sayi = 0;


        Scanner input = new Scanner(System.in);
        System.out.print(" Sayı Giriniz : ");
        x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum = sum + i;
                sayi = sayi + 1;

            }

        }

        System.out.print(sum / sayi);

    }
}
