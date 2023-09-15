import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print(" Değer Giriniz : ");
        n= input.nextInt();

        for (int i = 1; i<n; i*=4){
            System.out.println("Dördün Kuvveti : " + i);
        }
        for (int i = 1; i<n; i*=5){
            System.out.println("Beşin Kuvveti : " + i);
        }

    }
}