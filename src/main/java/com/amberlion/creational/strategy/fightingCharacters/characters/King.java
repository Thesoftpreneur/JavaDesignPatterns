package com.amberlion.creational.strategy.fightingCharacters.characters;

import com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors.SwordBehavior;

public class King extends Character {
    public King() {
        System.out.println("A king is created");
        setWeaponBehavior(new SwordBehavior());
    }
}
