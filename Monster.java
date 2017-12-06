public class Monster extends Character{
    private int rand(double b, double a){
    return (int) ((Math.random()*((b-a+1)+a)));
  }
  public Monster (){
    HP = rand(50,100);
    strength = (rand(20,65));
    defense = (rand(1,5));
    attackrating = (rand(1,5));
    ostrength = strength;
    odefense = defense;
  }
  public String toString(){
	String result = "";
	result += "HP: " + HP + System.lineSeparator() +
		  "Strength: " + strength + System.lineSeparator() +
		  "Defense: " + defense + System.lineSeparator() +
		  "Attack Rating: " + attackrating + System.lineSeparator();
        return result;

  }
}
