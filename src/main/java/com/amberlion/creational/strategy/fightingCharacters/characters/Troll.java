package com.amberlion.creational.strategy.fightingCharacters.characters;

import com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors.AxeBehavior;

public class Troll extends Character {
    Integer a = 4;
    public Troll() {

        System.out.println("A new Troll is present");
        setWeaponBehavior(new AxeBehavior());


    }

    public Integer getA() {
        return a;
    }
}
