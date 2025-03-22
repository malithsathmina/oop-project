package OOpProgect;

import OOpProgect.Army;

//Class for take a copy of a army elements fighting attributes.
public class CopyArmy {
  private double Attack ;
  private double Defence ;
  private double Health;
  private double Speed ;

  //take a copy
  public CopyArmy(Army army) {
      Attack = army.getAttack();
      Defence = army.getDefence();
      Health = army.getHealth();
      Speed = army.getSpeed();
  }
  
  
  //set the copied attributes to army characters.
  public static void SetArmy(Army army,CopyArmy copy){
      army.setAttack(copy.Attack);
      army.setDefence(copy.Defence);
      army.setHealth(copy.Health);
      army.setSpeed(copy.Speed);
  }

}