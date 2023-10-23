package week4.AdventureGame;

import week4.AdventureGame.Inventory;

import java.util.Scanner;

public class Player {
    private int damage, healthy, money, rHealthy;
    private String name, cName;
    private Inventory inv;
    Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inv = new Inventory();
    }

    public void selectCha() {
        System.out.println("===========================================");
        switch (chaMenu()) {
            case 1:
                initPlayer("\uD83E\uDDD9\uD83C\uDFFB\u200D♂\uFE0F Büyücü ", 5, 21, 15);
                break;
            case 2:
                initPlayer("\uD83C\uDFF9 Okçu ", 7, 18, 20);
                break;
            case 3:
                initPlayer("\uD83D\uDDE1\uFE0F Şovalye ", 8, 24, 5);
                break;
            default:
                initPlayer("\uD83E\uDD77\uD83C\uDFFB Samuray ", 5, 21, 15);
                break;
        }
        System.out.println("Karakter Oluşturuldu ! adı=" + getcName() + " ,Hasar=" + getDamage() + " ,Sağlık="
                + getHealthy() + " ,Para=" + getMoney());
    }

    public int chaMenu() {
        System.out.println("Lütfen bir karakter seçiniz : ");
        System.out.println("1- \uD83E\uDDD9\uD83C\uDFFB\u200D Büyücü\t Hasar : 5 \t Sağlık :21 \t Para :15");
        System.out.println("2- \uD83C\uDFF9 Okçu\t Hasar : 7 \t Sağlık :18 \t Para :20");
        System.out.println("3- \uD83D\uDDE1\uFE0F Şovalye\t Hasar : 8 \t Sağlık :24 \t Para :5");
        System.out.println("4- \uD83E\uDD77\uD83C\uDFFB Samuray\t Hasar : 5 \t Sağlık :21 \t Para :15");
        System.out.print("Karater Seçiminiz : ");
        int chaID = scan.nextInt();

        while (chaID < 1 || chaID > 4) {
            System.out.print("Lütfen geçerli bir karakter seçiniz : ");
            chaID = scan.nextInt();
        }

        return chaID;
    }

    public int getTotalDamage() {
        return this.getDamage() + this.getInv().getDamage();
    }

    public void initPlayer(String cName, int dmg, int hlthy, int mny) {
        setcName(cName);
        setDamage(dmg);
        setHealthy(hlthy);
        setMoney(mny);
        setrHealthy(hlthy);
    }

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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }

}
