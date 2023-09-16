import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scan = new Scanner(System.in);
        System.out.print("Hava Sıcakığını Giriniz : ");
        heat = scan.nextInt();

        if (heat <= 5) {
            System.out.print("Kayak Yapmaya Ne Dersiniz? ");
        } else if (heat >= 10 && heat <= 15) {
            System.out.print("Sinema veya Piknik için mükemmel bir gün! :) ");


        } else if (heat > 25) {
            System.out.print("Yüzmek için mükemel bir hava :) ");


        } else if (heat >= 15 && heat <= 25) {
            System.out.print("Piknik için mükemmel bir gün! :) ");


        } else {
            System.out.print("Sinema için mükemmel bir gün");
        }
    }
}

//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.