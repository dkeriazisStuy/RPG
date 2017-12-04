public class Character{
  protected int  HP;
  protected int strength;
  protected int defense;
  protected double attackrating;
  protected int ostrength;
  protected int odefense;

  private boolean isAlive(){
    if (HP != 0){
      return true;}
    else
    return false;
  }
  public int getDefense (){
    return defense;
  }
  private int lowerHP (int damage){
    HP = HP - damage;
    return HP;
  }
  public int attack (Character c1){
    int damage = (int) (strength * attackrating) - c1.defense;
    return damage;
  }
}
