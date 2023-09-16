import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int result;
        Scanner scan = new Scanner(System.in);

        while (a != 10) {
            System.out.println("1. sayıyı giriniz : ");
            a = scan.nextInt();
            if (a != 10)
                System.out.println("Lütfen sayıya soruda istenen 10 değerini giriniz : ");

        }

        while (b != 2) {
            System.out.println("2. sayıyı giriniz : ");
            b = scan.nextInt();
            if (b != 2)
                System.out.println("Lütfen sayıya soruda istenen 2 değerini giriniz : ");

        }

        while (c != 3) {
            System.out.print("3. sayıyı giriniz : ");
            c = scan.nextInt();
            if (c != 3)
                System.out.println("Lütfen sayıya soruda istenen 3 değerini giriniz : ");

        }

        result = a + (b * c) - b;
        System.out.println("Sonuç : " +result);
    }
}