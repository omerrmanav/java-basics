package palindromiksayilar;

import java.util.Scanner;

public class PalindromikSayilar {

    public static void main(String[] args) {

        /* 
        // 3 basamaklı tüm palindromik sayılar 
        
        int firstDigit, thirdDigit;
        for (int i = 100; i < 1000; i++) {
            int temp = i;
            thirdDigit = temp % 10;
            firstDigit = (temp / 10) / 10;
            if (firstDigit == thirdDigit) {
                System.out.println(temp);
            }
        } 
         */
        // Girilen bir sayının palindromik olup olmadığını anlama 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a new number : ");
        int sayi = input.nextInt();

        int tersi = 0;
        int kalan, gecici = sayi;
        while (gecici != 0) {
            kalan = gecici % 10;
            tersi = tersi * 10 + kalan;
            gecici /= 10;
        }
        System.out.println("Sayinin Tersi = " + tersi);

        if (sayi == tersi) {
            System.out.println(sayi + " sayisi palindromik bir sayidir");
        } else {
            System.out.println(sayi + " sayisi palindromik olamaz.");
        }

    }

}
