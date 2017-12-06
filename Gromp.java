public class Gromp extends Monster {
	//a Gromp has increased health and defense compared to other monsters
	//at the loss of strength and attack rating

	public Gromp(){
		HP += 20;
		defense *= 2;
		strength -= 15;
		attackrating -= 3;
	}

	public String toString(){
		String result = "";
		result += "Monster Type: Gromp" + System.lineSeparator() +
			  "This type of monster has increased health and defense, but less strength and attack rating" +
			  System.lineSeparator() +
			  "HP: " + HP + System.lineSeparator() +
		  	  "Strength: " + strength + System.lineSeparator() +
		  	  "Defense: " + defense + System.lineSeparator() +
		  	  "Attack Rating: " + attackrating + System.lineSeparator();
		return result;
        }
}
		
