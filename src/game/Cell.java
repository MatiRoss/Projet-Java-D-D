package game;

import characters.Character;
import characters.Warrior;
import characters.Wizard;
import enemies.Ennemy;
import equipments.BigHealthPotion;
import equipments.HealthPotion;
import equipments.Protections;
import equipments.Weapons;

public class Cell {

    private Ennemy ennemy;
    private BigHealthPotion bigHealthPotion;
    private HealthPotion healthPotion;
    private Protections defensiveStuff;
    private Weapons offensiveStuff;

    public Cell() {
    }

    public Ennemy getEnnemy() {
        return ennemy;
    }

    public BigHealthPotion getBigHealthPotion() {
        return bigHealthPotion;
    }

    public HealthPotion getHealthPotion() {
        return healthPotion;
    }

    public Protections getDefensiveStuff() {
        return defensiveStuff;
    }

    public Weapons getOffensiveStuff() {
        return offensiveStuff;
    }

    public void setEnnemy(Ennemy ennemy) {
        this.ennemy = ennemy;
    }

    public void setBigHealthPotion(BigHealthPotion bigHealthPotion) {
        this.bigHealthPotion = bigHealthPotion;
    }

    public void setHealthPotion(HealthPotion healthPotion) {
        this.healthPotion = healthPotion;
    }

    public void setDefensiveStuff(Protections defensiveStuff) {
        this.defensiveStuff = defensiveStuff;
    }

    public void setOffensiveStuff(Weapons offensiveStuff) {
        this.offensiveStuff = offensiveStuff;
    }
}

