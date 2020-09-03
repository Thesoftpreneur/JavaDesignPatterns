package com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Knife attack!!");
    }
}
