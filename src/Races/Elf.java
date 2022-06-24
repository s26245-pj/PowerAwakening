package Races;

import java.util.ArrayList;

public class Elf extends Hero {

    String raceName = "Races.Elf";

    public Elf(String raceName) {
        this.raceName = raceName;
        ArrayList<Hero.racialSkills> elfAbilities = new ArrayList<>();
        elfAbilities.add(Hero.racialSkills.flying);
        elfAbilities.add(Hero.racialSkills.vulnerability);
        this.setRacialAbilities(elfAbilities);
    }
}
