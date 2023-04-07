package encoktekraredeneleman;

import java.util.Scanner;

public class EnCokTekrarEdenEleman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin uzunlugunu giriniz : ");
        int uzunluk = input.nextInt();
        int[] dizi = new int[uzunluk];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".eleman : ");
            dizi[i] = input.nextInt();
        }

        int m = 0;
        do {
            int tekrar = dizi[0];
            for (int k = 0; k < uzunluk; k++) {
                if (dizi[k] == dizi[k + 1]) {
                    tekrar = dizi[k];
                    k++;
                }
                System.out.print("En cok tekrar edilen sayi : " + tekrar);
            }
            System.out.println();
        } while(m<uzunluk);
        
        //for(int sayi : dizi){}
    }

}
