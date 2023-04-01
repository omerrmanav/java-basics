import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int dogruSayi;
        dogruSayi = r.nextInt(50);

        System.out.println("--- Sayi Tahmin Oyunu ---");
        System.out.println("0 ve 50 arasinda sayi giriniz.");
        int sayi, hak = 5;
        int hataliGiris = 0;

        while (hak > 0) {
            System.out.print("tahmininiz : ");
            sayi = input.nextInt();

            int yakinlik = Math.abs(sayi - dogruSayi);

            if (sayi >= 50) {
                System.out.println("Olmasi gereken degerlerin disina ciktiniz !\n");
                hataliGiris++;
                if (hataliGiris == 1) {
                    System.out.println("0-50 arasi sayi girmen gerekiyor !");
                    System.out.println("Oyun kapatiliyor...");
                    break;
                }
                continue;
            }
            if (sayi == dogruSayi) {
                System.out.println("Tahmininiz Dogru :) ");
                break;
            } else {
                hak--;
                System.out.println("Cevabiniz yanlis. Kalan hakkiniz : " + hak);

                if (hak == 0) {
                    System.out.println("\nGame Over");
                    System.out.println("Dogru Sayi : " + dogruSayi);
                    break;
                }

                if (yakinlik > 5) {
                    System.out.println("Cok uzaksin :d ne beklion dene bida");
                } else {
                    System.out.println("Yaklasiyosun dostum devaaaamm....(Yakınlık mutlak değerce 5)");
                }
            }
            System.out.println();
        }
    }

}
