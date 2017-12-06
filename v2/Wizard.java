public class Wizard extends Protagonist {
    public Wizard(String name) {
        super(name);
        health = 150;
        strength = 7;
        start_defense = 5;
        start_attack = 20;
        normalize();
    }

    public String toString() {
        String result = super.toString() + System.lineSeparator();
        return result + "Class: Wizard";
    }
}