package palindromik.kelimeler;

import java.util.Scanner;

public class PalindromikKelimeler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cumlenizi giriniz :");
        String cümle = input.nextLine();

        String[] kelimeler = cümle.split(" ");

        for (String kelime : kelimeler) {
            if (isPalindromic(kelime) == true) {
                System.out.print(kelime + " ");
            }
        }

    }

    public static boolean isPalindromic(String kelime) {

        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) == kelime.charAt(kelime.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }
}
