import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Adaylar {
    Random rdm = new Random();
    Scanner input = new Scanner(System.in);

    int toplamOran = 0;
    int[] oran = new int[4];

    public enum Aday {
        ERDOGAN(1), INCE(2), KILICDAROGLU(3), OGAN(4);

        private int adayNo;

        Aday(int adayNo) {
            this.adayNo = adayNo;
        }

        public int getAdayNo() {
            return adayNo;
        }

        public void setAdayNo(int adayNo) {
            this.adayNo = adayNo;
        }
    }

    Aday cb;

    public void girisEkrani() {
        System.out.println("\n14 Mayıs 2023 Seçimleri\n");
        System.out.println("Aday Listesi");
        System.out.println("1- Recep Tayyip Erdoğan");
        System.out.println("2- Muharrem İnce");
        System.out.println("3- Kemal Kılıçdaroğlu");
        System.out.println("4- Sinan Oğan");
    }

    public void sonuc() {
        System.out.print("\nLütfen desteklediğiniz adayın numarasını girin (1-4): ");
        int adayNo = input.nextInt();
        while (adayNo < 1 || adayNo > 4) {
            System.out.print("Geçersiz seçim. Yeniden seçiniz : ");
            adayNo = input.nextInt();
        }

        oran[0] = rdm.nextInt(100 - toplamOran);
        toplamOran += oran[0];

        oran[1] = rdm.nextInt(100 - toplamOran);
        toplamOran += oran[1];

        oran[2] = rdm.nextInt(100 - toplamOran);
        toplamOran += oran[2];

        oran[3] = 100 - toplamOran;

        switch (adayNo) {
            case 1:
                cb = Aday.ERDOGAN;
                break;

            case 2:
                cb = Aday.INCE;
                break;

            case 3:
                cb = Aday.KILICDAROGLU;
                break;

            case 4:
                cb = Aday.OGAN;
                break;
        }
        System.out.println("Desteklediğiniz Aday : " + cb);
    }

    public void oranlar() {
        System.out.println();
        System.out.println("Oy Oranları ");
        System.out.println("Erdoğan : %" + oran[0]);
        System.out.println("İnce : %" + oran[1]);
        System.out.println("Kılıçdaroğlu : %" + oran[2]);
        System.out.println("Oğan : %" + oran[3]);
    }

    public void ikinciTuraKalanlar() {
        int maxOy = 0;

        for (int p = 0; p < oran.length; p++) {
            if (oran[0] > oran[maxOy]) {
                oran[maxOy] = oran[0];
            }

            if (oran[p] > 50) {
                System.out.println(
                        "İkinci Tura Kalmadan Seçimi %" + oran[p] + " ile " + Aday.values()[p] + " Kazanmıştır");
                return;
            }
        }

        Arrays.sort(oran);
        int[] yeniAdaylar = new int[4];

        for (int i = oran.length - 1; i >= 0; i--) {
            int temp = i;
            if (temp < yeniAdaylar.length) {
                yeniAdaylar[temp] = i;
            }
        }

        System.out.println("\nİkinci Tura Kalanlar");

        System.out.println("%" + oran[yeniAdaylar[2]] + Aday.values()[yeniAdaylar[2]]);
        System.out.println("%" + oran[yeniAdaylar[3]] + Aday.values()[yeniAdaylar[3]]);

    }
}