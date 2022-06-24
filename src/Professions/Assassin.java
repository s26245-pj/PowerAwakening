package Professions;

import Races.Hero;

import java.util.ArrayList;

public class Assassin extends HeroDecorator{

    private final Hero assassin;

    public Assassin(Hero hero){
        this.assassin = hero;
        addProfessionSkills(hero);
    }

    @Override
    public void heroToString() {

    }

    @Override
    public void addProfessionSkills(Hero hero) {
        ArrayList<Skills> assassinSkills = new ArrayList<>();
        if (!hero.getSkills().contains(Skills.sneaking)) {
            assassinSkills.add(Skills.sneaking);
        }
        if (!hero.getSkills().contains(Skills.poisons)) {
            assassinSkills.add(Skills.poisons);
        }
        if (!hero.getSkills().contains(Skills.meleeFight)) {
            assassinSkills.add(Skills.meleeFight);
        }
        hero.setSkills(assassinSkills);
    }
}
