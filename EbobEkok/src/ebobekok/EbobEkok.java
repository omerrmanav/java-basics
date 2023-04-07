// EKOK = (SAYI 1 * SAYI 2 ) / EBOB
package ebobekok;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2;
        System.out.println("2 sayi giriniz : ");
        sayi1 = input.nextInt();
        sayi2 = input.nextInt();

        int büyükSayi;
        if (sayi1 > sayi2) {
            büyükSayi = sayi1;
        } else {
            büyükSayi = sayi2;
        }

        int ebob = 0;
        for (int i = 1; i < büyükSayi; i++) {
            int temp = i;
            if (sayi1 % temp == 0 && sayi2 % temp == 0) {
                ebob = temp;
                System.out.println("OB : " + ebob);
            }
        }

        for (int j = 1; j < ebob; j++) {
            if (j > ebob) {
                ebob = j;
            }
        }
        System.out.println("-----------------------");
        System.out.println("EBOB : " + ebob);

        int ekok = (sayi1 * sayi2) / ebob;
        System.out.println("EKOK : " + ekok);
    }

}
