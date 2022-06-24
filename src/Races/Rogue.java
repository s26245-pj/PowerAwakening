package Races;

import Races.Hero;

import java.util.ArrayList;

public class Rogue extends Hero {

    String raceName = "Races.Rogue";

    public Rogue(String raceName) {
        this.raceName = raceName;
        ArrayList<racialSkills> rogueAbilities = new ArrayList<>();
        rogueAbilities.add(racialSkills.flying);
        rogueAbilities.add(racialSkills.vulnerability);
        this.setRacialAbilities(rogueAbilities);
    }
}
