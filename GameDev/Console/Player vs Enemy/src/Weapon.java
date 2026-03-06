package src;

class Weapon {

    public String name, level;
    public int damage;
    public Entity owner = null; // to get its infos later + also for upgrading when used to kill some other
                                // enetities

    public Weapon(String name, String level, int damage) {
        this.damage = damage;
        this.name = name;
        this.level = level;
    }

    public void setOwner(Entity entity) {
        this.owner = entity;
        entity.OwnWeapon(this);
    }

    public void useToKill(Entity entity) {
        boolean upgradeWhenKilled = owner != null; // if upgrade when kill or not
        if (upgradeWhenKilled) {
            this._kill(entity);
        } else {

        }
    }

    private void _kill(Entity entity) {
        if (entity.hp < this.damage) {
            // kill (instead of just damage)
            entity.hp = 0;
            return;
        }
        entity.hp -= this.damage;
        System.out.printf("%s attacked %s (using '%s')", owner != null ? owner.name : "RANDOM PLAYER", entity.name,
                this.name);
    }
}