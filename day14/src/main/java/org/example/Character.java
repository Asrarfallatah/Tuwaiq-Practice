package org.example;
import java.util.Random;

public class Character{
    protected String name;
    protected int health;

    Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int attack) {
        if (health > 0) {
            health -= attack;
            if (health < 0) health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}