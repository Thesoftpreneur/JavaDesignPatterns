package com.amberlion.creational.strategy.fightingCharacters.characters;

import com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        System.out.println("A queen is present");
        setWeaponBehavior(new KnifeBehavior());
    }
}
