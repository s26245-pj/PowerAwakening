package Professions;

import Races.Hero;

import java.util.ArrayList;

public class Armourer extends HeroDecorator{

    private final Hero armourer;

    public Armourer(Hero hero){
        this.armourer = hero;
        addProfessionSkills(hero);
    }


    @Override
    public void heroToString() {

    }

    @Override
    public void addProfessionSkills(Hero hero) {
        ArrayList<Skills> armourerSkills = new ArrayList<>();
        if (!hero.getSkills().contains(Skills.repairing)) {
            armourerSkills.add(Skills.repairing);
        }
        hero.setSkills(armourerSkills);
    }
}
