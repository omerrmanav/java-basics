import java.util.Scanner;
public class Canavarlar extends App{
    
    Scanner input = new Scanner(System.in);
    int givenDamage;
    int monsterHealth;

    public void zombie(int givenDamage, int monsterHealth){
        this.givenDamage = givenDamage;
        this.monsterHealth = monsterHealth;
        System.out.print("Ne kadar vuruş yapacaksın --> ");
        vurusSayisi = input.nextInt();
        health = health - (this.givenDamage * vurusSayisi);
        // System.out.println(hasar);
        // this.monsterHealth = this.monsterHealth - (vurusSayisi * hasar);
        this.monsterHealth = this.monsterHealth - (vurusSayisi * hasar);
        if(this.monsterHealth <= 0) {
            System.out.println("Zombiyi öldürmeyi başardınız !");
            System.out.println("Fakat kalan canın : " + health);
            System.out.println("Güvenli eve dönmeyi düşünebilirsin...");
        } else {
            System.out.println("Öldürmek istiyorsan savaşmaya devam etmek zorundasın...");
            System.out.println("Zombinin kalan canı : " + this.monsterHealth);
            System.out.println("Senin kalan canın : " + health);
        }

    }

    public void vampire(int givenDamage, int monsterHealth){
        this.givenDamage = givenDamage;
        this.monsterHealth = monsterHealth;
        health = health - givenDamage;
    } 

    public void bear(int givenDamage, int monsterHealth){
        this.givenDamage = givenDamage;
        this.monsterHealth = monsterHealth;
        health = health - givenDamage;
    } 
}
