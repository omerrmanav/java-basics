import java.util.Random;

public class Monsters {
    Random rdm = new Random();
    int damage;
    int healthy;
    int bonus;
    
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealthy() {
        return healthy;
    }
    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
