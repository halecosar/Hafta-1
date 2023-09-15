import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Sayi giriniz : ");
        int n = scanner.nextInt();

        // üst üçgen ;
        for (int i = 1; i <= n; i++) {
            for (a = n; a > i; a--) {
                System.out.print(" ");
            }
            for (b = 1; b <= i; b++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
// alt üçgen;
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