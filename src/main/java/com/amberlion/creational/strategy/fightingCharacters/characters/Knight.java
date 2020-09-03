package com.amberlion.creational.strategy.fightingCharacters.characters;

import com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors.BowAndArrowBehavior;

public class Knight extends Character {
    public Knight() {
        System.out.println("A Knight is created");
        setWeaponBehavior(new BowAndArrowBehavior());
    }
}
