import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        String burc = (" ");
        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz Ayı Giriniz : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz : ");
        day = input.nextInt();


        if (((month <= 12) && (month >= 1) && (day >= 0 && day < 31))) {
            if (month == 1) {
                if (day >= 1 && day <= 21) {
                    System.out.println("Oğlak Burcu. ");
                } else {
                    System.out.print("Kova Burcu. ");
                }
            } else if (month == 2) {
                if (day >= 1 && day <= 19) {
                    System.out.println("Kova Burcu. ");
                } else {
                    System.out.print(" Balık Burcu. ");
                }
            } else if (month == 3) {
                if (day >= 1 && day <= 20) {
                    System.out.println("Balık Burcu. ");
                } else {
                    System.out.print(" Koç Burcu. ");
                }
            } else if (month == 4) {
                if (day >= 1 && day <= 20) {
                    System.out.println("Koç Burcu. ");
                } else {
                    System.out.print(" Boğa Burcu. ");
                }
            } else if (month == 5) {
                if (day >= 1 && day <= 21) {
                    System.out.println("Boğa Burcu. ");
                } else {
                    System.out.print(" İkizler Burcu. ");
                }
            } else if (month == 6) {
                if (day >= 1 && day <= 22) {
                    System.out.println("İkizler Burcu. ");
                } else {
                    System.out.print(" Yengeç Burcu. ");
                }
            } else if (month == 7) {
                if (day >= 1 && day <= 22) {
                    System.out.println("Yengeç  Burcu. ");
                } else {
                    System.out.print(" Aslan Burcu. ");
                }
            } else if (month == 8) {
                if (day >= 1 && day <= 21) {
                    System.out.println(" Aslan  Burcu. ");
                } else {
                    System.out.print(" Başak Burcu. ");
                }
            } else if (month == 9) {
                if (day >= 1 && day <= 22) {
                    System.out.println(" Başak  Burcu. ");
                } else {
                    System.out.print(" Terazi Burcu. ");
                }
            } else if (month == 10) {
                if (day >= 1 && day <= 22) {
                    System.out.println(" Terazi Burcu. ");
                } else {
                    System.out.print(" Akrep Burcu. ");
                }
            } else if (month == 11) {
                if (day >= 1 && day <= 21) {
                    System.out.println(" Akrep Burcu. ");
                } else {
                    System.out.print(" Yay Burcu. ");
                }
            } else if (month == 12) {
                if (day >= 1 && day <= 21) {
                    System.out.println(" Yay  Burcu. ");
                } else {
                    System.out.print(" Oğlak Burcu. ");
                }
            }

        } else {
            System.out.print(" Hatalı Giriş Yaptınız. Lütfen Tekrar Deneyiniz. ");
        }


    }
}
