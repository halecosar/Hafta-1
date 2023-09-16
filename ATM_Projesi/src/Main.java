import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName;
        String password;
        int right = 3;
        int select;
        int balance = 1500; //bakiye

        Scanner scan = new Scanner(System.in);

        while (right > 0) //giriş hakkın 0'dan fazla olduğu sürece;
        {
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = scan.nextLine();
            System.out.print("Parolanızı Giriniz : ");
            password = scan.nextLine();


            if (userName.equals("halecosar") && password.equals("hale123")) {
                System.out.print("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz! ");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = scan.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default:
                            // 4 girildiği durumda çıkış yapmak istenir fakat 1-4 harici tuşlama yapıldıysa hatalı giriş yaılmıştır.
                            if (select != 4) {
                                System.out.println("Geçersiz seçim. Lütfen 1 ile 4 arasında tuşlama yapınız. ");
                                break;
                            }

                    }
                }
                while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }

    }
}