package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.Health = 700;
        boss.Damage = 50;
        boss.weapon.setWeaponType("Огнестрельный");
        boss.weapon.setWeaponName("Автомат");
        System.out.println(boss.Health + " " + boss.Damage + " " + boss.weapon.getWeaponType() + " " + boss.weapon.getWeaponName());
    }
}
