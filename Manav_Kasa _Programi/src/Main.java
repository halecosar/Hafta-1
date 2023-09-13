import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double  priceArmut=2.14,
                priceElma= 3.67,
                pricedomates=1.11,
                pricemuz=0.95,
                pricepatlican=5.0;

        double  kilogramarmut,
                kilogramelma,
                kilogramdomates,
                kilogrammuz,
                kilogrampatlican,
                total;


        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        kilogramarmut = input. nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        kilogramelma = input. nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        kilogramdomates = input. nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        kilogrammuz = input. nextDouble();

        System.out.print("Patlican Kaç Kilo? : ");
        kilogrampatlican = input. nextDouble();

        total= (kilogramarmut * priceArmut) + (kilogramelma * priceElma) +(kilogramdomates * pricedomates)+ (kilogrammuz * pricemuz) + (kilogrampatlican * pricepatlican);
        System.out.print("Toplam Tutar  = " + total);



    }
}