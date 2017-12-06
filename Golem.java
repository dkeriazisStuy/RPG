public class Golem extends Monster {

	//a Golem has increased defense compared to other monsters
	//at the loss of strength

	public Golem() {
		defense += 2;
        	strength -= 10;
	}

	public String toString(){
		String result = "";
		result += "Monster Type: Golem" + System.lineSeparator() +
			  "This type of monster has increased defense but less strength" +
			  System.lineSeparator() +
			  "HP: " + HP + System.lineSeparator() +
		  	  "Strength: " + strength + System.lineSeparator() +
		  	  "Defense: " + defense + System.lineSeparator() +
		  	  "Attack Rating: " + attackrating + System.lineSeparator();
		return result;
        }
}
	
