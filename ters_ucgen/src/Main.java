
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, c, d;
        System.out.print("Sayi giriniz : ");
        int n = scanner.nextInt();



        for (a = 1; a <= n; a++) {
            for (c = 1; c <= a; c++) {
                System.out.print(" ");
            }
            for (d = n; d > a; d--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}