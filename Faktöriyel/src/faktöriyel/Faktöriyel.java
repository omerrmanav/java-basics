package faktöriyel;

import java.util.Scanner;

public class Faktöriyel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, faktöriyel = 1;
        System.out.println("Faktoriyelini almak istediginiz sayiyi girin: ");
        sayi = input.nextInt();

        System.out.print(sayi + "! = ");

        for (int i = sayi; sayi >= 1; sayi--) {
            faktöriyel *= sayi;
        }
        System.out.print(faktöriyel + "\n");

    }

}
