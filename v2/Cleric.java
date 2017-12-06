public class Cleric extends Protagonist {
    public Cleric(String name) {
        super(name);
        health = 200;
        strength = 5;
        start_defense = 15;
        start_attack = 7.5;
        normalize();
    }

    public String toString() {
        String result = super.toString() + System.lineSeparator();
        return result + "Class: Cleric";
    }
}