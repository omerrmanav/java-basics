import java.util.Scanner;
public class App {
    int budget = 100;
    int health = 100;
    int vurusSayisi = 0;
    int hasar = 0; 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int karakterSecimi, canavarSecimi;
        Karakterler karakter = new Karakterler();
        Canavarlar canavar = new Canavarlar();
        System.out.println();
        System.out.println("----- Oyuna Hoşgeldin -----");
        System.out.println("Öncelikle savaşacağın karakteri seçmen gerekiyor !");
        System.out.println();
        System.out.println("KARAKTERLER");
        System.out.println("1- Savaşçı");
        System.out.println("2- Okçu");
        System.out.println("3- Büyücü");
        System.out.print("Karakteriniz : ");
        karakterSecimi = input.nextInt();
        switch(karakterSecimi){
            case 1: 
            karakter.warrior(10, 5);
            break;

            case 2:
            karakter.archer(20, 10);
            break;

            case 3:
            karakter.wizard(30, 15);
            break;

            default:
            System.out.println("Geçerli bir karakter seçmediniz !");
        }
        System.out.println();
        System.out.println("CANAVARLAR");
        System.out.println("1- Zombi (100)");
        System.out.println("2- Vampir (140)");
        System.out.println("3- Ayı (200)");
        System.out.print("Rakibiniz : ");
        canavarSecimi = input.nextInt();
        switch(canavarSecimi){
            case 1: 
            canavar.zombie(3, 100);
            break;

            case 2:
            canavar.vampire(4, 140);
            break;

            case 3:
            canavar.bear(6, 200);
            break;

            default:
            System.out.println("Geçerli bir canavar seçmediniz !");
        }
        input.close();
    }
}
