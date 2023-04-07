import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);
    int warriorDamage;
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamage() {
        return warriorDamage;
    }

    public void setDamage(int warriorDamage) {
        this.warriorDamage = warriorDamage;
    }  
}
