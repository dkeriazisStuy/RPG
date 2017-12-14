public class UserOfRPGv3 {
    public static void main(String[] args) {
        Character[] agents = new Character[8];
        // Error if class instantiated:
        // Protagonist is abstract; cannot be instantiated
        // agents[0] = new Protagonist("Mike");
        agents[1] = new Fighter("Eleven");
        agents[2] = new Cleric("Dustin");
        agents[3] = new Wizard("Lucas");
        agents[4] = new Monster();
        agents[5] = new Demogorgon();
        agents[6] = new MindFlayer();
        agents[7] = new Orcus();
        for (Character agent : agents) {
            System.out.println(agent);
            System.out.println();
        }
    }
}