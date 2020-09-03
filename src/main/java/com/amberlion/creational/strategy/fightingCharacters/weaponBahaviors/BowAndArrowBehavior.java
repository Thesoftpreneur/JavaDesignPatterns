package com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Bow and arrow attack!!");
    }
}
