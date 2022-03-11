package com.myapp.belajar.oop.bLatihan;

class PlayerEncapsulasi {
    private String name;
    private Integer level;
    private Integer baseHealth;
    private Integer baseAtk;
    private Integer baseDef;
    Weapon weapon;
    Armor armor;
    //status
    private Integer incrementHealth;
    private Integer incrementAtk;
    private Integer incrementDef;
    //battle phase
    private Integer totDamage;
    private Integer currHealth;
    private Boolean isAlive;

    public PlayerEncapsulasi(String name) {
        this.name = name;
        this.level = 1;
        this.baseHealth = 100;
        this.baseAtk = 50;
        this.baseDef = 20;
        this.incrementHealth = 30;
        this.incrementAtk = 30;
        this.incrementDef = 50;
        this.isAlive = true;
    }

    public Integer getTotDamage() {
        return totDamage;
    }

    public void setTotDamage(Integer totDamage) {
        this.totDamage = totDamage;
    }

    public Integer getCurrHealth() {
        if (this.currHealth == null) {
            return this.getMaxHealth();
        }
            return currHealth;
    }

    public void setCurrHealth(Integer currHealth) {
        if (currHealth <= 0) {
            this.currHealth = 0;
        } else {
            this.currHealth = currHealth;
        }

    }

    public Integer getMaxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getHealth();
    }

    public Integer getMaxAtk() {
        return this.baseAtk + this.level * this.incrementAtk + this.weapon.getAtk();
    }

    public Integer getMaxDefence() {
        return this.baseDef + this.level * this.incrementDef + this.armor.getDef() + this.weapon.getDef();
    }

    private void levelUp() {
        this.level++;
    }


    //equip item
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    //attack
    public void attack(PlayerEncapsulasi opponent,Integer critical){
        Integer damage;
        Integer totDamage;
        Integer newCurrHealth;
        damage = (this.getMaxAtk() - opponent.getMaxDefence() * 50/100) * critical;
        if (opponent.getTotDamage() == null) {
            opponent.setTotDamage(0);
        }
        if (critical == 1) {
            System.out.println("attack");
        }else if (critical == 2){
            System.out.println("double strike");
        } else if (critical == 3){
            System.out.println("triple combo");
        } else {
            System.out.println("insane attack");
        }
        System.out.println(opponent.name + " got " + damage + " damage.");
        totDamage = opponent.getTotDamage() + damage;
        opponent.setTotDamage(totDamage);
        newCurrHealth = opponent.getMaxHealth() - opponent.getTotDamage();
        opponent.setCurrHealth(newCurrHealth);
        this.levelUp();
    }

    //heal
    public void heal(PlayerEncapsulasi object){
        Integer increaseHeal;
        increaseHeal = object.getCurrHealth() + 100;
        System.out.println(object.name + " heal 100 HP");
        object.setCurrHealth(increaseHeal);
    }

    //ultra
    public void ultimate(PlayerEncapsulasi object){
        object.setCurrHealth(13009);
        object.level = 100;
        object.baseAtk = 999;
        object.baseDef = 999;
        object.baseHealth = 9999;
    }

    //display
    public void display() {
        System.out.println("Level\t: " + this.level);
        System.out.println("Name\t: " + this.name);
        System.out.println("HP\t\t: " + this.getCurrHealth() + "/" + this.getMaxHealth());
        System.out.println("Atk\t\t: " + this.getMaxAtk());
        System.out.println("Def\t\t: " + this.getMaxDefence());
        System.out.println("Weapon\t: " + this.weapon.getName());
        System.out.println("Armor\t: " + this.armor.getName() + "\n");
    }

    public void displayBattle(){
        System.out.println("Level\t: " + this.level);
        System.out.println("Name\t: " + this.name);
        System.out.println("HP\t\t: " + this.getCurrHealth() + "/" + this.getMaxHealth() + "\n");
        if (getCurrHealth() == 0){
            System.out.println(this.name + " has been defeated");
        }
    }


}

class Weapon {
    private String name;
    private Integer atk;
    private Integer def;

    public Weapon(String name, Integer atk, Integer def) {
        this.name = name;
        this.atk = atk;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public Integer getAtk() {
        return atk;
    }

    public Integer getDef() {
        return def;
    }
}

class Armor {
    private String name;
    private Integer def;
    private Integer health;

    public Armor(String name, Integer def, Integer health) {
        this.name = name;
        this.def = def;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getHealth() {
        return health;
    }
}


public class LatihanEncapsulasi {
    public static void main(String[] args) {
        //init
        PlayerEncapsulasi player1 = new PlayerEncapsulasi("Fatrald");
        PlayerEncapsulasi player2 = new PlayerEncapsulasi("Cempluk");
        Weapon demonHunter = new Weapon("demon hunter", 100, 20);
        Armor bladeArmor = new Armor("blade armor",50,100);
        Weapon mysticalWand = new Weapon("mystical wand", 50, 100);
        Armor wanderingRobe = new Armor("wandering robe", 100, 10);

        player1.setWeapon(demonHunter);
        player1.setArmor(bladeArmor);
        player2.setWeapon(mysticalWand);
        player2.setArmor(wanderingRobe);
        System.out.println("-------------------------");
        System.out.println("Player");
        System.out.println("-------------------------");
        player1.display();
        player2.display();
        System.out.println("-------------------------");
        System.out.println("Match 1");
        System.out.println("-------------------------");
        player1.attack(player2,1);
        player1.displayBattle();
        player2.displayBattle();
        System.out.println("-------------------------");
        System.out.println("Match 2");
        System.out.println("-------------------------");
        player2.heal(player2);
        player1.displayBattle();
        player2.displayBattle();
        player2.attack(player1,3);
        player1.displayBattle();
        player2.displayBattle();
        System.out.println("-------------------------");
        System.out.println("Match 3");
        System.out.println("-------------------------");
        player1.attack(player2,1);
        player1.displayBattle();
        player2.displayBattle();
        System.out.println("-------------------------");
        System.out.println("Match 4");
        System.out.println("-------------------------");
        player2.ultimate(player2);
        player2.display();
        player2.attack(player1,1);
        player1.displayBattle();
        player2.displayBattle();
    }
}
