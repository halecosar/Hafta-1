import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        String availableUsername = "halecosar";
        String availablePassword = "hale123";
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        username = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (username.equals(availableUsername) && password.equals(availablePassword)) {
            System.out.print("Giriş Yapılıyor... ");
        } else {
            System.out.print("Hatalı Kullanıcı adı ya da şifre girdiniz, şifrenizi sıfırlamak isterseniz 1'e; basın. Yenissden giriş yapmak için 2'ye basın. !");
            int secim = input.nextInt();
            if (secim == 1) {
                System.out.print(" Lütfen yeni şifrenizi giriniz ");
                Scanner input2 = new Scanner(System.in);
                String newpassword = input2.nextLine();

                if (newpassword.equals("hale123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    availablePassword = newpassword;
                    System.out.print("Şifre oluşturuldu.");
                }
            } else if (secim == 2) {
                System.out.print("Tekrar deneyiniz.");
            } else {
                System.out.print("Hatalı giriş yaptınız.");
            }
        }

    }

}

