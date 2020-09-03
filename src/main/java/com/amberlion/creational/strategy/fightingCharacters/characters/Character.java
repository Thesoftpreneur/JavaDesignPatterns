package com.amberlion.creational.strategy.fightingCharacters.characters;

import com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {

    }

    public void attack() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
