import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1;
        double sayi2;

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        sayi1 = scan.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        sayi2 = scan.nextDouble();

        double ondalikliSayi = sayi1;
        int tamSayi = (int) sayi2;

        System.out.println(ondalikliSayi);
        System.out.print(tamSayi);


    }

}
