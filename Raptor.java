public class Raptor extends Monster {

	//a Raptor has increased attack rating compared to other monsters
	//at the loss of defense

	public Raptor(){
		attackrating += 2;
		defense -= 2;
	}

	public String toString(){
		String result = "";
		result += "Monster Type: Raptor" + System.lineSeparator() +
			  "This type of monster has increased attack rating but less defense" +
			  System.lineSeparator() +
			  "HP: " + HP + System.lineSeparator() +
		  	  "Strength: " + strength + System.lineSeparator() +
		  	  "Defense: " + defense + System.lineSeparator() +
		  	  "Attack Rating: " + attackrating + System.lineSeparator();
		return result;
        }
}

