package com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword attack!!");
    }
}
