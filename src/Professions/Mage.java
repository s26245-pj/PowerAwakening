package Professions;


import Races.Hero;

import java.util.ArrayList;

public class Mage extends HeroDecorator{

    private Hero mage;

    public Mage(Hero hero){
        this.mage = hero;
        addProfessionSkills(hero);
    }
    @Override
    public void heroToString() {

    }
    @Override
    public void addProfessionSkills(Hero hero) {
        ArrayList<Skills> mageSkills = new ArrayList<>();
        if (!hero.getSkills().contains(Skills.sorcery)) {
            mageSkills.add(Skills.sorcery);
        }
        if (!hero.getSkills().contains(Skills.elixirs)) {
            mageSkills.add(Skills.elixirs);
        }
        hero.setSkills(mageSkills);
    }

}
