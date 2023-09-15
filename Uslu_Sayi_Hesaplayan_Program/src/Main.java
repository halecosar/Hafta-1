import java.util.Scanner;
// değişken tanımlayacağız. üssü alınacak, üs, total
public class Main {
    public static void main(String[] args) {
        int n, k, total=1;

        Scanner scan = new Scanner(System.in);
        System.out.print(" Hangi sayının üssü alınacak? : ");
        n = scan.nextInt();
        System.out.print(" Sayının kaçıncı üssü hesaplanacak? : ");
        k= scan.nextInt();

        for(int i=1; i<= k; i++){
            total *= n; }
            System.out.print(total);


    }


}//
