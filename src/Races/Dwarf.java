package Races;

import java.util.ArrayList;

public class Dwarf extends Hero {

    String raceName = "Races.Dwarf";

    public Dwarf(String raceName) {
        this.raceName = raceName;
        ArrayList<Hero.racialSkills> dwarfAbilities = new ArrayList<>();
        dwarfAbilities.add(Hero.racialSkills.superDurability);
        dwarfAbilities.add(Hero.racialSkills.nightVision);
        this.setRacialAbilities(dwarfAbilities);
    }
}
