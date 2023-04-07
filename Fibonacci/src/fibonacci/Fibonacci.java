package fibonacci;

// 0 1 1 2 3 5 8 13 21 34...
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ilkSayi = 0;
        int ikinciSayi = 1;
        int sonuc = ilkSayi + ikinciSayi; //1

        System.out.println("Fibonacci Dizisi : ");
        System.out.println("------------------------------------------");
        System.out.print("Dizinin uzunlugunu giriniz : ");
        int n = input.nextInt();

        if (n == 1) {
            System.out.print(ilkSayi + " ");
        } else if (n == 2) {
            System.out.print(ilkSayi + " " + ikinciSayi + " ");
        } else {
            System.out.print(ilkSayi + " " + ikinciSayi + " " + sonuc);
        }

        for (int i = 1; i <= n - 3; i++) {
            int temp = ilkSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonuc;
            sonuc = ilkSayi + ikinciSayi;
            System.out.print(" " + sonuc);
        }
        System.out.println();
    }
}
