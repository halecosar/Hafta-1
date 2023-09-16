import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int a;
        int b;
        int c;
        int result;
        Scanner scan = new Scanner(System.in);


        System.out.print("1. sayıyı giriniz : ");
        a = scan.nextInt();


        System.out.print("2. sayıyı giriniz : ");
        b = scan.nextInt();


        System.out.print("3. sayıyı giriniz : ");
        c = scan.nextInt();


        result = a + (b * c) - b;
        System.out.print("Sonuç : " + result);
    }
}