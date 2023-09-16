import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        int sayac = 1;
        int ebob = 1;
        int ekok =1;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        number1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        number2 = input.nextInt();
// ebob bulmak için her iki sayının da i'ye bölümünden kalan 0 olmalıdır.

        while (sayac <= number1) {

            if (number1 % sayac == 0 && number2 % sayac == 0) {
                ebob = sayac;
            }
            sayac++;
        }
        System.out.println(" Girilen Sayıların EBOB'U :" + ebob);

        //EKOK = (number1*number2) / EBOB
        ekok= (number1*number2)/ebob;

        System.out.print(" Girilen Sayıların EKOK'U :" + ekok);





    }


}