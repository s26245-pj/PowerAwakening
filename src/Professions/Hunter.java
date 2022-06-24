package Professions;


import Races.Hero;

import java.util.ArrayList;

public class Hunter extends HeroDecorator {

    private final Hero hunter;

    public Hunter(Hero hero){
        this.hunter = hero;
        addProfessionSkills(hero);
    }

    @Override
    public void heroToString() {

    }

    @Override
    public void addProfessionSkills(Hero hero) {
        ArrayList<Skills> hunterSkills = new ArrayList<>();
        if (!hero.getSkills().contains(Skills.sneaking)) {
            hunterSkills.add(Skills.sneaking);
        }
        if (!hero.getSkills().contains(Skills.archery)) {
            hunterSkills.add(Skills.archery);
        }
        hero.setSkills(hunterSkills);
    }
}
