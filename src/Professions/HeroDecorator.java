package Professions;

import Races.Hero;
import Races.ICanBeHero;
import java.util.ArrayList;

abstract  class HeroDecorator extends Hero implements ICanBeHero {
    protected String profession;
    protected Hero tempHero;

    public abstract void addProfessionSkills(Hero hero);


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Hero getTempHero() {
        return tempHero;
    }

    public void setTempHero(Hero tempHero) {
        this.tempHero = tempHero;
    }
}
