import Professions.Mage;
import Professions.Warrior;
import Races.Dwarf;
import Races.Hero;
import Races.Human;

public class Main {

    public static void main(String[] args) {
        Dwarf gimli = new Dwarf("Dwarf");
        System.out.println(gimli.getRacialAbilities());
        System.out.println(gimli.getSkills());

        Hero gimliWarrior = new Warrior(gimli);
        System.out.println(gimli.getRacialAbilities());
        System.out.println(gimli.getSkills());

        Human gandalf = new Human("Human");
        System.out.println(gandalf.getRacialAbilities());
        System.out.println(gandalf.getSkills());

        Hero gandalfWhite = new Mage(gandalf);
        System.out.println(gandalf.getRacialAbilities());
        System.out.println(gandalf.getSkills());



    }
}
