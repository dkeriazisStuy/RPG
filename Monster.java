public class Monster extends Character {
    /*
    fields
        life/health/HP as an int
        strength as an int
        defense as an int
        attack rating as a double

        name intentionally omitted

    methods

        constructor
            initializes all attributes (for example, 125, 100, 40, 0.4)
            sets strength to a random number ( ...Might I suggest the range [20,65) )
            suggested other attribute values::  life 150; defense 20; attack: 1
        isAlive  returns boolean indicating living or dead
        getDefense
        lowerHP   takes an int parameter, decreases life attribute by that amount
        attack
            takes a Protagonist as a parameter
            calculates damage using this formula: calculates damage using this formula: damage = (strength * attack rating) - warrior defense
            damage should be an integer value
    */

    private int randInt(int a, int b) {
        return (int) (Math.random() * (b - a) + a);
    }

    public Monster() {
        health = 150;
        strength = randInt(20, 65);
        defense = 20;
        attack = 1;
        // System.out.println("Health: " + health);
        // System.out.println("Strength: " + strength);
        // System.out.println("Defense: " + defense);
        // System.out.println("Attack: " + attack);

    }

}