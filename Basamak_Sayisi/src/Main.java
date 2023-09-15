import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;

        int basamakSayisi = 0;
        int basamakDegeri;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        a = scan.nextInt();
        int tempNumber = a;

        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            basamakSayisi++;
        }

        tempNumber = a;
        while (tempNumber != 0) {
            basamakDegeri = tempNumber % 10;
            toplam = toplam + basamakDegeri;
            tempNumber = tempNumber / 10;

        }

        System.out.print("Basamak Değerleri Toplamı : " + toplam);

    }
}