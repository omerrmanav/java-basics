import java.util.Random;
import java.util.Scanner;

public class Game {
    Player warrior = new Player();
    Location location = new Location();
    Monsters monster = new Monsters();
    Random rdm = new Random();
    ShopCentre shop = new ShopCentre();
    Scanner input = new Scanner(System.in);
    String name;
    int money = 50;
    int healthy = 50;
    int damage;
    boolean gameState = true;
    int selectMenu;
    
    public void login(){
        System.out.println("\nNEW GAME");
        System.out.println("Welcome to XXX Game\n");
        System.out.print("Enter your nickname : ");
        name = input.nextLine();
        System.out.print("Now, you have to choose warrior," + name);
        System.out.print("\n\nBefore you go to Arena remember that:\n-Money: " + money + "\t Healthy: " + healthy);
    }

    public void choiceChar(){
        System.out.println("\n\nWARRIORS");
        System.out.println("1- Turk \t Damage: 30 \t Price: 15");
        System.out.println("1- Wizard \t Damage: 20 \t Price: 10");
        System.out.println("1- Archer \t Damage: 10 \t Price: 5");
        System.out.print("Your warrior: ");
        int selectChar = input.nextInt();

        while(selectChar < 1 || selectChar > 3){
            System.out.println("Enter a valid number !");
            selectChar = input.nextInt();
        }
        
        switch(selectChar){
            case 1:
            warrior.setDamage(30);
            warrior.setPrice(15);
            damage = warrior.warriorDamage;
            money = money - warrior.price;
            break;
            
            case 2:
            warrior.setDamage(20);
            warrior.setPrice(10);
            damage = warrior.warriorDamage;
            money = money - warrior.price;
            break;

            case 3:
            warrior.setDamage(10);
            warrior.setPrice(5);
            damage = warrior.warriorDamage;
            money = money - warrior.price;
            break;
        }
        System.out.println("\n" + "Damage: " + damage + "\nMoney: " + money);
    }
    
    public void menu(){
        do{
            System.out.println("\nMENU");
            System.out.println("1- Safe House (Regeneration)");
            System.out.println("2- Battle Arena");
            System.out.println("3- Shop Centre");
            System.out.println("4- Info");
            System.out.println("5- Quit");
            System.out.print("Where wil you go," + name + ": ");
            selectMenu = input.nextInt();
            
            while(selectMenu < 1 || selectMenu > 5){
                System.out.println("Enter a valid number !");
                selectMenu = input.nextInt();
            }

            switch(selectMenu){
                case 1:
                location.setCanYenile(50);
                healthy = location.canYenile;
                System.out.println("New health: " + healthy);
                break;

                case 2:
                System.out.println("\nBATTLE ARENA");
                System.out.println("1- Cave");
                System.out.println("2- Forest");
                System.out.println("3- Village");
                System.out.print("Your choice: ");
                int selectArea = input.nextInt();
                if(selectArea == 1) {
                    int numberOfMonster = rdm.nextInt(10);
                    monster.setDamage(3);
                    monster.setHealthy(10);
                    System.out.println("There is " + numberOfMonster + " Zombie");
                    int newMonsterHealth = (numberOfMonster * monster.healthy);
                    System.out.println("Monsters' total health: " + newMonsterHealth);
                    System.out.println("Are you gonna fight ?");
                    String selectFight = input.next();
                    if(selectFight.equals("yes") && gameState == true) {
                        newMonsterHealth -= warrior.warriorDamage * numberOfMonster;
                        healthy = healthy - (numberOfMonster *monster.damage);

                        if(newMonsterHealth <= 0 && healthy > 0) {
                            System.out.println("\nCongrulations, you killed them all!");
                            System.out.println("New health: " + healthy);   
                        } else {
                            System.out.println("\nKilled by zombies...\nGAME OVER");
                            System.out.println("New health: " + newMonsterHealth);
                            gameState = false;
                        }
                        int prize = rdm.nextInt(4);
                        System.out.println("You earned: " + prize + " prize");
                        monster.setBonus(5);
                        money += monster.getBonus();
                        System.out.println("Money: " + money + " TL");
                    }
                }
                else if(selectArea == 2) {
                    int numberOfMonster = rdm.nextInt(10);
                    monster.setDamage(5);
                    monster.setHealthy(10);
                    System.out.println("There is " + numberOfMonster + " Bear");
                    int newMonsterHealth = (numberOfMonster * monster.healthy);
                    System.out.println("Monsters' total health: " + newMonsterHealth);
                    System.out.println("Are you gonna fight ?");
                    String selectFight = input.next();
                    if(selectFight.equals("yes") && gameState == true) {
                        newMonsterHealth -= warrior.warriorDamage * numberOfMonster;
                        healthy = healthy - (numberOfMonster *monster.damage);

                        if(newMonsterHealth <= 0 && healthy > 0) {
                            System.out.println("\nCongrulations, you killed them all!");
                            System.out.println("New health: " + healthy);   
                        } else {
                            System.out.println("\nKilled by zombies...\nGAME OVER");
                            System.out.println("New health: " + newMonsterHealth);
                            gameState = false;
                        }
                        int prize = rdm.nextInt(5);
                        System.out.println("You earned: " + prize + " prize");
                        monster.setBonus(10);
                        money += monster.getBonus();
                        System.out.println("Money: " + money + " TL");
                    }
                }
                else if(selectArea == 3) {
                    int numberOfMonster = rdm.nextInt(10);
                    monster.setDamage(7);
                    monster.setHealthy(6);
                    System.out.println("There is " + numberOfMonster + " Vampir");
                    int newMonsterHealth = (numberOfMonster * monster.healthy);
                    System.out.println("Monsters' total health: " + newMonsterHealth);
                    System.out.println("Are you gonna fight ?");
                    String selectFight = input.next();
                    if(selectFight.equals("yes") && gameState == true) {
                        newMonsterHealth -= warrior.warriorDamage * numberOfMonster;
                        healthy = healthy - (numberOfMonster *monster.damage);

                        if(newMonsterHealth <= 0 && healthy > 0) {
                            System.out.println("\nCongrulations, you killed them all!");
                            System.out.println("New health: " + healthy);   
                        } else {
                            System.out.println("\nKilled by zombies...\nGAME OVER");
                            System.out.println("New health: " + newMonsterHealth);
                            gameState = false;
                        }
                        int prize = rdm.nextInt(6);
                        System.out.println("You earned: " + prize + " prize");
                        monster.setBonus(15);
                        money += monster.getBonus();
                        System.out.println("Money: " + money + " TL");
                    }
                }
                break;

                case 3:
                System.out.println("\nSHOPPING");
                System.out.println("---Powers---");
                System.out.println("1- Basic Power");
                System.out.println("2- Legendary Power");
                System.out.println("---Armors---");
                System.out.println("3- Basic Armor");
                System.out.println("4- Legendary Armor");
                System.out.print("Your choice: ");
                int selectShop = input.nextInt();
                switch(selectShop){
                    case 1:
                    shop.setDamage(10);
                    shop.setMaaliyet(15);
                    if(shop.getMaaliyet() > money) {
                        System.out.println("Insufficient balance");
                    } else {
                        money = money - shop.getMaaliyet();
                    }
                    damage = damage + shop.getDamage();
                    break;

                    case 2:
                    shop.setDamage(25);
                    shop.setMaaliyet(30);
                    if(shop.getMaaliyet() > money) {
                        System.out.println("Insufficient balance");
                    } else {
                        money = money - shop.getMaaliyet();
                    }
                    damage = damage + shop.getDamage();
                    break;

                    case 3:
                    shop.setArmor(10);
                    shop.setMaaliyet(15);
                    if(shop.getMaaliyet() > money) {
                        System.out.println("Insufficient balance");
                    } else {
                        money = money - shop.getMaaliyet();
                    }
                    healthy = healthy + shop.getArmor();
                    break;

                    case 4:
                    shop.setDamage(25);
                    shop.setMaaliyet(30);
                    if(shop.getMaaliyet() > money) {
                        System.out.println("Insufficient balance");
                    } else {
                        money = money - shop.getMaaliyet();
                    }
                    healthy = healthy + shop.getArmor();
                    break;
                }
                break;

                case 4:
                System.out.println("INFO");
                System.out.println("Healthy: " + healthy);
                System.out.println("Damage: " + damage);
                System.out.println("Money: " + money);
                break;

                case 5:
                break;
            }
        }while(gameState && selectMenu !=5);
    }
}
