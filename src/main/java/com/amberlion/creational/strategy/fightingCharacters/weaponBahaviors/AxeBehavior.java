package com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe attack!!");
    }
}
