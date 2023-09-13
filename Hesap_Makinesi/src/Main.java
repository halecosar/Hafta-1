import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int number1,number2;
    int select;

    Scanner input = new Scanner(System.in);
    System.out.print("1. Sayıyı Giriniz : ");
    number1= input.nextInt();

    System.out.print("2. Sayıyı Giriniz : ");
    number2= input.nextInt();

    System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
    System.out.println("Seçiminizi Yapınız ");
    select= input.nextInt();

    System.out.println(select);

    switch (select) {
        case 1 : System.out.println("Toplama Sonucu = " + (number1 + number2)); break;
        case 2 : System.out.println("Çıkarma Sonucu = " + (number1 - number2)); break;
        case 3 : System.out.println("Çarpma Sonucu = " + (number1 * number2)); break;
        case 4 :
            switch (number2){
            case 0: System.out.println("Bir sayı sıfıra bölünemez."); break;
            default:  System.out.println("Bölme Sonucu = " + (number1 / number2)); break;
        } break;
        default : System.out.println("Hatalı Seçim yaptınız, tekrar deneyiniz...  ");
    }




    }
}