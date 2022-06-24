package Races;

import java.util.ArrayList;

public abstract class Hero implements ICanBeHero {

    enum racialSkills{
        nightVision,
        superDexterity,
        superDurability,
        flying,
        vulnerability
    }
    protected enum Skills{
        meleeFight,
        swordFight,
        axeFight,
        spearFight,
        sorcery,
        elixirs,
        sneaking,
        poisons,
        repairing,
        archery
    }

    protected String raceName;
    protected ArrayList<Skills> skills = new ArrayList<>();
    protected ArrayList<racialSkills> racialAbilities = new ArrayList<>();


    public void heroToString() {
        System.out.println("Race: " + raceName +
                            "Racial abilities: " + racialAbilities +
                            "Profession skills: " + skills);
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }

    public ArrayList<racialSkills> getRacialAbilities() {
        return racialAbilities;
    }

    public void setRacialAbilities(ArrayList<racialSkills> racialAbilities) {
        this.racialAbilities = racialAbilities;
    }
}
