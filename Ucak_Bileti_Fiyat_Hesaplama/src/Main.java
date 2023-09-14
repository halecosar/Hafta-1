import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas;
        int yolculukTipi;
        int mesafe;
        double normalTutar;
        double yasIndirimi;
        double indirimliTutar;
        double gidisDonusBiletIndirimi;
        double toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas >= 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            normalTutar = mesafe * 0.10;
            if (yas < 12) {
                yasIndirimi = (normalTutar / 2);
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = (normalTutar * 0.1);
            } else if (yas >= 65) {
                yasIndirimi = (normalTutar * 0.3);
            } else {
                yasIndirimi = 0;
            }

            indirimliTutar = normalTutar - yasIndirimi;

            if (yolculukTipi == 2) {
                gidisDonusBiletIndirimi = indirimliTutar * 0.2;
                toplamTutar = (indirimliTutar - gidisDonusBiletIndirimi) * 2;
            } else {
                toplamTutar = indirimliTutar;
            }

            System.out.println("Toplam Tutar = " + toplamTutar);
        } else {
            System.out.print("Hatalı Veri Girdiniz ! ");
        }
    }
}