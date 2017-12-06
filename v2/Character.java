public class Character {
    /*
    life/health/HP as an int
    strength as an int
    defense as an int
    attack rating as a double
    isAlive
    getDefense
    lowerHP
    attack, which needs modification to…
        take a Character as a parameter
        calculate damage using this formula: damage = (strength * attack rating) - other Character’s defense
        damage should be an integer value
    */
    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;

    public boolean isAlive() {
        return health > 0;
    }

    public int getDefense() {
        return defense;
    }

    public void lowerHP(int amount) {
        health -= amount;
    }

    public int attack(Character c) {
        int damage = (int) (strength * attack - c.getDefense());
        c.lowerHP(damage);
        return damage;
    }
}