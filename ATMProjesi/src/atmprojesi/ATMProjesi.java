package atmprojesi;

import java.util.Scanner;

public class ATMProjesi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ATM Giris Ekrani");
        System.out.println("----------------------");

        int hak = 3;
        String dogruKimlikNo = "ömer";
        String dogruSifre = "123";

        while (hak > 0) {
            System.out.print("Kimlik numaraniz : ");
            dogruKimlikNo = input.nextLine();
            System.out.print("Sifreniz : ");
            dogruSifre = input.nextLine();

            if (dogruKimlikNo.equals("ömer") && dogruSifre.equals("123")) {
                System.out.print("Giris Basarili\n");
                break;
            } else {
                hak--;
                System.out.println("Sifre veya kimlik no hatali. Kalan deneme hakkiniz :" + hak);
                if (hak == 0) {
                    System.out.println("Hesabiniz Bloke Edilmistir !");
                    break;
                }
            }
            System.out.println();
        }

        int secim = 0, yatirmaTutari = 0, cekmeTutari = 0, transferSecimi, transferMiktari = 0;
        int bakiye = 10000;
        int yatirilanToplam = 0;
        int cekilenToplam = 0;
        int transferToplam = 0;

        do {
            if (hak == 0) {
                break;
            }
            System.out.println();
            System.out.println("Hangi islemle devam etmek istersiniz ?");
            System.out.println("1 - Bakiye Sorgulama");
            System.out.println("2 - Para Yatirma");
            System.out.println("3 - Para Cekme");
            System.out.println("4 - Para Gonderme");
            System.out.println("5 - Hesap Ozeti");
            System.out.println("6 - Cikis");

            System.out.print("Seciminiz : ");
            secim = input.nextInt();

            while (secim > 6) {
                System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz !");
                System.out.print("Seciminiz : ");
                secim = input.nextInt();
            }
            
            switch (secim) {
                case 1:
                    System.out.print("Bakiyeniz : " + bakiye);
                    break;

                case 2:
                    System.out.print("Yatirmak istediginiz tutar : ");
                    yatirmaTutari = input.nextInt();
                    bakiye = yatirmaTutari + bakiye;
                    yatirilanToplam += yatirmaTutari;
                    break;

                case 3:
                    System.out.print("Cekmek istediginiz tutar : ");
                    cekmeTutari = input.nextInt();
                    if (cekmeTutari > bakiye) {
                        System.out.print("Cekmek istediginiz tutar bakiyenizi asmaktadir !");
                        cekmeTutari = 0;
                    } else {
                        bakiye = bakiye - cekmeTutari;
                        cekilenToplam += cekmeTutari;
                    }
                    break;

                case 4:
                    System.out.println("-- Hesabinizdaki Kayitli Kisiler --");
                    System.out.println("1 - Kizim \n2 - Oglum \n3 - Esim");
                    System.out.print("Seciminiz : ");
                    transferSecimi = input.nextInt();
                    System.out.print("Gondereceginiz Miktar :");
                    transferMiktari = input.nextInt();
                    if (bakiye >= transferMiktari) {
                        System.out.println(transferMiktari + " TL sectiginiz hesaba transfer edilmistir !");
                        bakiye = bakiye - transferMiktari;
                        transferToplam += transferMiktari;
                    } else {
                        System.out.println("İslem Basarisiz..");
                        bakiye = bakiye;
                    }
                    break;

                case 5:
                    System.out.println("-- HESAP OZETI --");
                    System.out.println("Guncel Bakiyeniz : " + bakiye);
                    System.out.println("Yatirdiginiz Miktar : " + yatirilanToplam);
                    System.out.println("Cektiginiz Miktar : " + cekilenToplam);
                    System.out.println("Transfer Edilen Miktar : " + transferToplam);
                    break;

                case 6:
                    System.out.println("Sistemden cikis yapiliyor...");
            }
            System.out.println();

        } while (secim != 6);
    }
}
