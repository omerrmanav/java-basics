package mayin.tarlasi;

import java.util.Scanner;
import java.util.Random;

public class MayinTarlasi {

    public static int[][] HaritaDoldur(int satir, int sutun) {
        Random rdm = new Random();
        Scanner input = new Scanner(System.in);

        int matris[][] = new int[satir][sutun];

        int i = 0;
        while (i < satir) {
            int j = 0;
            while (j < sutun) {
                matris[i][j] = rdm.nextInt(2);
                j = j + 1;
            }
            i = i + 1;
        }
        
        /*for (int k = 0; k < satir; k++) {
            for (int l = 0; l < sutun; l++) {
                System.out.print(matris[k][l] + " ");
            }
            System.out.println();
        } */
        
        for (int k = 0; k < satir; k++) {
            for (int l = 0; l < sutun; l++) {
                System.out.print("* ");
            }
            System.out.println();
        } 
        return matris;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Oyunun satir boyutu : ");
        a = input.nextInt();
        System.out.print("Oyunun sutun boyutu : ");
        b = input.nextInt();
        int gameMatris[][] = HaritaDoldur(a, b);

        int puan = 0;
        boolean kontrol = true;
        int x, y;
        while (true) {
            System.out.print("Secmek istediginiz koordinatin x degeri : ");
            x = input.nextInt();
            System.out.print("Secmek istediginiz koordinatin y degeri : ");
            y = input.nextInt();
            if (gameMatris[x][y] == 1) {
                kontrol = false;
            } else {
                kontrol = true;
                puan += 10;
                System.out.println("Bombadan kil payi kurtuldunuz..");
            }
            if (kontrol == false) {
                System.out.println("Game over. Puaniniz : " + puan);
                break;
            }
            System.out.println();
        }
    }
}
