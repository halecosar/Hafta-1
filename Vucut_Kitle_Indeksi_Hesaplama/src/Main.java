import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilo,boy;
       Scanner imput = new Scanner(System.in);
       System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy= imput.nextDouble();
        System.out.print("Lütfen Kilonuzu Kilogram Cinsinden Giriniz : ");
        kilo = imput.nextDouble();

       double indeks = (kilo / (boy * boy));
       System.out.print("Vücut Kitle İndeksiniz = " + indeks);



    }
}