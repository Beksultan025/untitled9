package com.company;

public class Boss extends GameEntity{
    Weapon weapon1 = new Weapon("Fire arm" , "Aka47");
    public Weapon getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(Weapon weapon1) {
        this.weapon1 = weapon1;
    }
}