class Protagonist {
    /*
    fields
        name
        life/health/HP as an int
        strength as an int
        defense as an int
        attack rating as a double
    methods
        constructor
            takes String input to name the Protagonist
            initializes all attributes (eg, 125, 100, 40, 0.4)
        isAlive  returns boolean indicating living or dead
        getDefense
        getName
        lowerHP   takes an int parameter, decreases life attribute by that amount
        attack
            takes a Monster as a parameter
            calculates damage using this formula: damage = (strength * attack rating) - monster defense
            damage should be an integer value
        specialize
            prepares the Protagonist to perform a special attack
            decreases defense attribute
            increases attack attribute
        normalize
            prepares the Protagonist to perform a normal attack
            resets defense attribute
            resets attack attribute
    */
    private String name;
    private int health;
    private int strength;
    private int defense;
    private double attack;

    public Protagonist(String name) {
        this.name = name;
        health = 100;
        strength = 10;
        normalize();
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    public void lowerHP(int amount) {
        health -= amount;
    }

    public void attack(Monster m) {
        double damage = strength * attack - m.getDefense();
    }

    public void specialize() {
        if (defense >= 0) {
            defense -= 1;
            attack += 1;
        }
    }

    public void normalize() {
        defense = 5;
        attack = 5;
    }
}