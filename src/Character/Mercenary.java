package Character;

import Location.Location;

public class Mercenary extends Player {
    public Mercenary(Location loc, int hitPoints, int baseAttack, int baseDefence, int level, int experience, int moveSpaces, String characterName){
        super(loc, hitPoints, baseAttack, baseDefence, level, experience, 2, characterName);
    }

    public void attack(){

    }
}
