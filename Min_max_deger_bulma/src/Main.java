import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kacSayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz? ");
        kacSayi = scan.nextInt();
        int a;
        int tempEnKucuk = 0;
        int tempEnBuyuk = 0;

        for (int i = 1; i <= kacSayi; i++) {
            System.out.print(i + ". sayıyı giriniz : ");

            a = scan.nextInt();
            if (i == 1) {
                tempEnKucuk=a;
                tempEnBuyuk=a;
            }
            else{
                if(a<tempEnKucuk){
                    tempEnKucuk=a;
                }
                if(a>tempEnBuyuk){
                    tempEnBuyuk=a;
                }
            }
        }

        System.out.println("En büyük sayı : " + tempEnBuyuk);
        System.out.println("En küçük sayı : " + tempEnKucuk);

    }
}