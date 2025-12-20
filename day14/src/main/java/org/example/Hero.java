package org.example;

    import java.util.Random;

    public class Hero extends Character implements Action {
        Random random = new Random();

        Hero(String name, int health) {
            super(name, health);
        }

        public void health() {
            int healing = random.nextInt(15) + 5;
            if (health <= 50) {
                System.out.println(name + " (·•᷄∩•᷅ ) health is low: " + health);
            } else {
                health += healing;
                System.out.println(name + " healed +" + healing + " HP! \n ₊˚ʚ \uD83C\uDF31 ₊˚✧ ﾟ. \n New health: " + health);
            }
        }

        public void attack(Dragon d) {
            int attack = random.nextInt(30) + 10;
            d.takeDamage(attack);
            System.out.println(name + " attacks " + d.getName() + " for -" + attack + " HP!");
        }

        public void damage() {
            int damage = random.nextInt(30) + 10;
            health -= damage;
            System.out.println(name + " took " + damage + " damage!");
        }
    }