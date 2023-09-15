import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);
        //dışarıdan girilen sayının iki ve dördün katı olduğu kontrol eidldi.
        do {
            System.out.print("Sayı Giriniz : ");
            n = input.nextInt();
            // Dörde tam bölünen sayılar ikiye de tam ölünebileceği için n%2==0 ifadesi kaldırıldı.
            if (n % 2 == 0 && n % 4 == 0) {
                total = total + n;
            }
        }
        // tek sayı olana kadar çalışması için;
        while (n % 2 == 0);
        System.out.print(total);
    }
}
