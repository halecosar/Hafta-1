import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        a = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        b = input.nextInt();
        System.out.print("3. Sayıyı Giriniz : ");
        c = input.nextInt();
        // a'nın en küçük olması durumunda; ya b<c ya da c<b olabilir;

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a<b<c");
            } else {
                System.out.print("a<c<b");
            }

        }
        // b'nin en küçük olması durumunda; ya a<c ya da c<a olabilir;
        else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b<a<c");
            } else {
                System.out.print("b<c<a");
            }
        }
        else{
            if (b < a) {
                System.out.print("c<b<a");
            } else {
                System.out.print("c<a<b");
            }
        }
    }
}

