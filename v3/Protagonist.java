public abstract class Protagonist extends Character {
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
    protected String name;
    protected int start_defense;
    protected double start_attack;

    public Protagonist(String name) {
        this.name = name;
        health = 100;
        strength = 10;
        start_defense = 5;
        start_attack = 5;
        normalize();
    }

    // Error if class not abstract:
    // Protagonist is not abstract and does not override abstract method toString() in Protagonist
    public abstract String toString();

    public String getName() {
        return name;
    }

    public void specialize() {
        if (defense >= 0) {
            defense -= 1;
            attack += 1;
        }
    }

    public void normalize() {
        defense = start_defense;
        attack = start_attack;
    }
}