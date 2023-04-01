public class Karakterler extends App{
    int damage; 
    int price;

    public void warrior(int damage, int price) {
        this.damage = damage;
        this.price = price;
        hasar = this.damage;
        budget = budget - this.price;
        System.out.println("Kalan Bütçe : " + budget);
        // System.out.println("Hasarınız: " + hasar);
    }

    public void archer(int damage, int price) {
        this.damage = damage;
        this.price = price;
        hasar = this.damage;
        budget = budget - this.price;
        System.out.println("Kalan Bütçe : " + budget);
        // System.out.println("Hasarınız: " + hasar);
    }

    public void wizard(int damage, int price) {
        this.damage = damage;
        this.price = price;
        hasar = this.damage;
        budget = budget - this.price;
        System.out.println("Kalan Bütçe : " + budget);
        // System.out.println("Hasarınız: " + hasar);
    }
}
