import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double  pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r = input.nextInt();

        double alan =(r * r * pi);
        double cevre = (2 * pi * r);

        System.out.print("Dairenin Alanı = " + alan);
        System.out.print(" Dairenin Çevresi = " + cevre);


    }
}