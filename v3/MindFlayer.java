public class MindFlayer extends Monster {
    public MindFlayer() {
        health = randInt(150, 250);
        strength = randInt(10, 20);
        defense = randInt(30, 35);
        attack = randInt(5, 10);
    }

    public String toString() {
        String result = super.toString() + System.lineSeparator();
        return result + "Class: Mind Flayer";
    }
}