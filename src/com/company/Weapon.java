package com.company;

public class Weapon {
    private String Weapon_Type;
    private String Name;

    public Weapon(){}

    public Weapon(String weapon_Type, String name) {
        Weapon_Type = weapon_Type;
        Name = name;
    }

    public String getWeapon_Type() {
        return Weapon_Type;
    }

    public void setWeapon_Type(String weapon_Type) {
        Weapon_Type = weapon_Type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
