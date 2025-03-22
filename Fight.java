package OOpProgect;

//This class use to handle the fighting part of the game.

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class Fight {

  public static boolean Attack(Army attacker , Army defender,String land){
      if(land=="Arcane" && attacker.getCategory() == "Mystics"){
          double increasingHealth = Math.round((attacker.getHealth())*1.1*10)/10.0;
      }
      //this should round to one decimal place.
      double Reduced_Health = 0.5* attacker.getAttack()-0.1 * defender.getDefence();
      double health = Math.round((defender.getHealth()-Reduced_Health)*10)/10.0;
      defender.setHealth(health);
      if(defender.getHealth()<=0){
          defender.setHealth(0);
      }

      System.out.println(attacker.getName()+" attack "+defender.getName()+" "+defender.getHealth());
      if (defender.getHealth()<=0){
          defender.setHealth(0);
          defender.setDefence(0);
          defender.setSpeed(0);
          System.out.println(defender.getName()+" DIED!");
          System.out.println();
          return true;
      }
      System.out.println();
      return false;
  }

}
