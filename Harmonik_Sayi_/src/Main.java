import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("N Sayısını Giriniz : ");
        int n = scan.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n; i++) {
            result = result + (1 / i);


        }
        System.out.print(result);

    }
}