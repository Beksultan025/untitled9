package com.company;

public class GameEntity {
    public int Health;
    public int Damage;
    public String weapon;

    public void setHealth(int health) {
        Health = health;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }
}
