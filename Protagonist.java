public class Protagonist extends Character{
    protected String name;
    public Protagonist (String pname){
    name = pname;
    HP = 100;
    strength = 10;
    defense = 5;
    attackrating = 10;
    ostrength = strength;
    odefense = defense;
  }
    public String getName (){
      return name;
    }
    public String specialize(){
      defense--;
      strength++;
      return "RAAAAAAAA!!!!";
    }
    public String normalize(){
      strength = ostrength;
      defense = odefense;
      return "OwO";
    }
    public String toString(){
      String Stats = "Name: " + name + "HP: " + HP + "strength: " + strength +"defense: " + defense;
      return Stats;
    }
}
