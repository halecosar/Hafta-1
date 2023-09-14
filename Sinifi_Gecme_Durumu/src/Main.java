import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluşturacağız
        int mat, fizik, kimya, turkce, muzik;

        //scanner sınıfını tanımladım
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri alalım
        System.out.print("Mat Notunuzu Giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();

        int toplam = 0;
        int sayac = 0;
        if (mat >= 0 && mat <= 100) {
            toplam = toplam + mat;
            sayac = sayac + 1;
        }

        if (fizik >= 0 && fizik <= 100) {
            toplam = toplam + fizik;
            sayac = sayac + 1;
        }

        if (kimya >= 0 && kimya <= 100) {
            toplam = toplam + kimya;
            sayac = sayac + 1;
        }
        if (turkce >= 0 && turkce <= 100) {
            toplam = toplam + turkce;
            sayac = sayac + 1;
        }

        if (muzik >= 0 && muzik <= 100) {
            toplam = toplam + muzik;
            sayac = sayac + 1;
        }

        double sonuc = toplam / sayac;

        if (sonuc <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere !");
        } else {
            System.out.println("Tebrikler, sınıfı gçtiniz !");
        }

        System.out.println("Ortalamanız : " + sonuc);
    }
}