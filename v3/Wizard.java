public class Wizard extends Protagonist {
    public Wizard(String name) {
        super(name);
        health = 150;
        strength = 7;
        start_defense = 5;
        start_attack = 20;
        normalize();
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

    // Error if method not present:
    // Wizard is not abstract and does not override abstract method toString() in Protagonist
    public String toString() {
        String result = "Name: " + name + System.lineSeparator();
        result += "Health: " + health + System.lineSeparator();
        result += "Strength: " + strength + System.lineSeparator();
        result += "Defense: " + defense + System.lineSeparator();
        result += "Attack: " + attack;
        result += "Class: Wizard";
        return result;
    }
}