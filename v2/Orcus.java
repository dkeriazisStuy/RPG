public class Orcus extends Monster {
    public Orcus() {
        health = randInt(50, 100);
        strength = randInt(30, 70);
        defense = randInt(5, 10);
        attack = randInt(10, 15);
    }

    public String toString() {
        String result = super.toString() + System.lineSeparator();
        return result + "Class: Orcus";
    }
}