import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int total=0;
        System.out.print("Bir Sayı Giriniz : ");
        n= input.nextInt();

        for(int i=1; i<n; i++){

            if(n%i==0){
                total= total+i;

            }

        }
       if(total==n){
           System.out.print( n + " Mükemmel Sayıdır. ");
       }
       else {
           System.out.print(n + " Mükemmel Sayı Değildir. ");
       }


    }
}