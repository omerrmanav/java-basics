
package girilen3sayininenbüyükveenkücükolanininbul;

import java.util.Scanner;
public class Girilen3SayininEnBüyükVeEnKücükOlanininBul {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,secim;
        System.out.println("3 sayi giriniz : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        System.out.println("Hangi islemle devam etmek istersiniz ?");
        System.out.println("-------------------------------------------------");
        System.out.println("1- En buyuk sayiyi bul : ");
        System.out.println("2- En kucuk sayiyi bul : ");
        secim = input.nextInt();
        switch(secim){
            case 1 : 
                if(a>b && a>c) {
                    System.out.println("En buyuk sayi : " +a);
                }
                else if(b>c && b>a) {
                    System.out.println("En buyuk sayi : " +b);
                }
                else {
                    System.out.println("En buyuk sayi : " +c);
                }
                break;
            case 2 : 
                if(a<b && a<c) {
                    System.out.println("En kucuk sayi : " +a);
                }
                else if(b<c && b<a) {
                    System.out.println("En kucuk sayi : " +b);
                }
                else {
                    System.out.println("En kucuk sayi : " +c);
                }
                break;
        }
        
    }
    
}
