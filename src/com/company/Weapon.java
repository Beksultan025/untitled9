package com.company;

public class Weapon {
    private String WeaponType;
    private String WeaponName;

    public Weapon (){}
    public Weapon(String weaponType, String weaponName) {
        WeaponType = weaponType;
        WeaponName = weaponName;
    }

    public String getWeaponType() {
        return WeaponType;
    }

    public void setWeaponType(String weaponType) {
        WeaponType = weaponType;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }
}
