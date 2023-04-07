package baklavadilimi;

import java.util.Scanner;

public class BaklavaDilimi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int giris;
        System.out.print("Ucgenin yuksekligini giriniz : ");
        giris = input.nextInt();

        int i, j, yildiz, bosluk;
        yildiz = 1;
        bosluk = giris - 1;

        for (i = 0; i < (giris / 2) + 1; i++) {
            for (j = 0; j < bosluk / 2; j++) {
                System.out.print("<");
            }
            for (j = 0; j < yildiz; j++) {
                System.out.print("=");
            }
            for (j = 0; j < bosluk / 2; j++) {
                System.out.print(">");
            }
            System.out.println();
            bosluk -= 2;
            yildiz += 2;
        }
            bosluk += 2;
            yildiz -= 2;
        for (i = (giris / 2) + 1 ; i < giris; i++) {
            bosluk += 2;
            yildiz -= 2;
            for (j = 0; j < bosluk / 2; j++) {
                System.out.print("<");
            }
            for (j = 0; j < yildiz; j++) {
                System.out.print("=");
            }
            for (j = 0; j < bosluk / 2; j++) {
                System.out.print(">");
            }
            System.out.println();
        }
    }

}
