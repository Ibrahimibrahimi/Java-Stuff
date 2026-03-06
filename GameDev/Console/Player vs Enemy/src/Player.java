package src;

/*
 * The player and Enemy both of
 * them extends the properties 
 * of the class Entity
*/

class Player extends Entity {
    public Player(String name, String level, int hp, int attack) {
        super(name, level, hp, attack);
        this.type = "Player";
        // Players got +10 hp free
        this.HP += 10;
        this.hp += 10;
    }
}