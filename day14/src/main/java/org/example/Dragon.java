package org.example;

import java.util.Random;

public class Dragon extends Character implements Action{

        Random random = new Random();

        Dragon(String name, int health) {
            super(name, health);
        }

        public void health() {
            int healing = random.nextInt(15) + 5;
            if (health <= 50) {
                System.out.println(name + " health is low: " + health);
            } else {
                health += healing;
                System.out.println(name + " healed +" + healing + " HP! New health: " + health);
            }
        }

        public void attack(Hero h) {
            int attack = random.nextInt(15) + 8;
            h.takeDamage(attack);
            System.out.println(name + " attacks back " + h.getName() + " for -" + attack + " HP!");
        }

        public void damage() {
            int damage = random.nextInt(30) + 10;
            health -= damage;
            System.out.println(name + " took " + damage + " damage!");
        }
    }
