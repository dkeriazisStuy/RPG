public class Fighter extends Protagonist {
    public Fighter(String name) {
        super(name);
        health = 75;
        strength = 20;
        start_defense = 15;
        start_attack = 10;
        normalize();
    }

    public String toString() {
        String result = super.toString() + System.lineSeparator();
        return result + "Class: Fighter";
    }
}