package com.amberlion.creational.strategy.fightingCharacters;

import com.amberlion.creational.strategy.fightingCharacters.characters.Queen;
import com.amberlion.creational.strategy.fightingCharacters.characters.Character;
import com.amberlion.creational.strategy.fightingCharacters.characters.Troll;
import com.amberlion.creational.strategy.fightingCharacters.weaponBahaviors.BowAndArrowBehavior;

public class MiniFightSimulator {
    public static void main(String[] args) {
        Character q = new Queen();
        q.attack();
        q.setWeaponBehavior(new BowAndArrowBehavior());
        q.attack();
        q = new Troll();
        q.attack();
    }
}
