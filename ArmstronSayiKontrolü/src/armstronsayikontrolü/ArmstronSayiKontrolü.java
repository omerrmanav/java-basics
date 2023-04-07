package armstronsayikontrolü;

import java.util.Scanner;

public class ArmstronSayiKontrolü {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, onlar, birler, yüzler;

        System.out.println("3 basamakli sayi giriniz: ");
        sayi = input.nextInt();

        birler = sayi % 10;
        onlar = (sayi / 10) % 10;
        yüzler = sayi / 100;

        if (sayi == (Math.pow(birler, 3)) + (Math.pow(onlar, 3)) + (Math.pow(yüzler, 3))) {
            System.out.println("Bu sayi Armstrong bir sayidir!");
        } else {
            System.out.println("Bu sayi Armstrong bir sayi degildir!");
        }
    }
}
