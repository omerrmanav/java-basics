package asalsayi;

import java.util.Scanner;

public class AsalSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        do {
            System.out.print("Sayi giriniz : ");
            sayi = input.nextInt();
        } while (sayi < 2);

        boolean asal = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }
        }

        if (asal == true) {
            System.out.println(sayi + " : Asaldir");
        } else {
            System.out.println(sayi + " : Asal Degildir");
        }

    }
}
