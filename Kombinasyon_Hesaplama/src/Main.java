import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,r;
        int nFaktoriyel = 1;
        int rFaktoriyel =1;
        int nEksirfaktöriyel =1;
        double sonuc =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kümedeki Eleman Sayısını Giriniz : ");
        n = input.nextInt();
        System.out.print("Hesaplanmasını İstediğiniz Konbinasyon Sayısını Giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nFaktoriyel = nFaktoriyel* i;
        }

        for (int i = 1; i <= r; i++) {
            rFaktoriyel = rFaktoriyel * i;
        }

        for (int i = 1; i <= (n-r); i++) {
            nEksirfaktöriyel = nEksirfaktöriyel * i;
        }

        sonuc= nFaktoriyel/(rFaktoriyel * nEksirfaktöriyel);

        System.out.print(sonuc);
    }
}