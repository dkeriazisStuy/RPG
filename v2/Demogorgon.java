public class Demogorgon extends Monster {
    public Demogorgon() {
        health = randInt(100, 200);
        strength = randInt(20, 40);
        defense = 20;
        attack = randInt(5, 10);
    }

    public String toString() {
        String result = super.toString() + System.lineSeparator();
        return result + "Class: Demogorgon";
    }
}