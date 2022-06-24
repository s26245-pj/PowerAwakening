package Professions;

import Races.Hero;

import java.util.ArrayList;

public class Warrior extends HeroDecorator{

    private final Hero warrior;

    public Warrior(Hero hero){
        this.warrior = hero;
        addProfessionSkills(hero);
    }

    @Override
    public void heroToString() {

    }

    public void addProfessionSkills(Hero hero) {
        ArrayList<Hero.Skills> warriorSkills = new ArrayList<>();
        if (!hero.getSkills().contains(Skills.meleeFight)) {
            warriorSkills.add(Skills.meleeFight);
        }
        if (!hero.getSkills().contains(Skills.swordFight)) {
            warriorSkills.add(Skills.swordFight);
        }
        if (!hero.getSkills().contains(Skills.axeFight)) {
            warriorSkills.add(Skills.axeFight);
        }
        if (!hero.getSkills().contains(Skills.spearFight)) {
            warriorSkills.add(Skills.spearFight);
        }
        hero.setSkills(warriorSkills);
    }
}
