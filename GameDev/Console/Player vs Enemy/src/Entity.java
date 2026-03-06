package src;

class Entity {
    public String name, level, type;
    public int HP, hp, attack;
    public Weapon[] weapons = new Weapon[] { null, null, null, null }; // each entity has only 4 weapons

    public Entity(String name, String level, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.HP = hp; // final
        this.level = level;
        this.type = "Entity";
        this.attack = attack;
        System.out.printf("==> CREATED : " +
                "\n\tType = %s" +
                "\n\tName = %s" +
                "\n\tAttack = %d" +
                "\n\tHP = %d" +
                "\n",
                this.type, this.name, this.attack, this.HP);
    }

    public boolean canAddWeapon(Weapon weapon) {
        // if exists => return False
        // if full => return False
        // else => DO NOT ADD + return True
        for (Weapon w : weapons) {
            // compare infos
            if (w != null) {
                if (w.name.equals(w.name)) {
                    System.out.printf("WEAPON %s already exists in %s inventory", w.name, this.name);
                    return false;
                }
            }
        }
        return true;
    }

    public void OwnWeapon(Weapon weapon) {
        if (canAddWeapon(weapon)) {
            // search for an empty place to add
            for (int i = 0; i < this.weapons.length; i++) {
                if (weapons[i] == null) {
                    weapons[i] = weapon;
                    System.out.printf("Adding the %d%s weapon", i, (i == 1) ? "st" : (i == 2) ? "nd" : "th");
                    return;
                }
            }
        } else {
            System.out.printf("Can't add weapon : %s", weapon.name);
        }
    }
}