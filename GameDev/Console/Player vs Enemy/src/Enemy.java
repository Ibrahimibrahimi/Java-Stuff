package src;

class Enemy extends Entity {
    public Enemy(String name, String level, int attack, int HP) {
        super(name, level, HP, attack);
        this.type = "Entity";
        // the enemy by default has a weapon "carves"
        this.OwnWeapon(new Weapon("Carves", "A", 100));
    }
}