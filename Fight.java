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
  public static void HealerAttack(Army attacker , Army receiver ,String land){
    if(land=="Arcane" && attacker.getCategory() =="Mystics"){
        double increasingHealth = Math.round((attacker.getHealth())*1.1*10)/10.0;
    }
    double Increased_Health = 0.1*attacker.getAttack();
    double health = Math.round((receiver.getHealth()+Increased_Health)*10)/10.0;
    receiver.setHealth(health);
    System.out.println(attacker.getName()+" Heal "+receiver.getName()+" to "+receiver.getHealth());
    System.out.println();
}

//
public static void Win(UserProfile U1,UserProfile U2){
    //let's consider U1 is the attacking player and u2 is the defending player.
    boolean win1 = U1.getArcher().getHealth()==0 && U1.getKnight().getHealth()==0 && U1.getMage().getHealth()==0 && U1.getHealer().getHealth()==0 && U1.getMythical_Creature().getHealth()==0;
    boolean win2 = U2.getArcher().getHealth()==0 && U2.getKnight().getHealth()==0 && U2.getMage().getHealth()==0 && U2.getHealer().getHealth()==0 && U2.getMythical_Creature().getHealth()==0;
    if(win2){
        System.out.println(U1.getName()+" "+"WON!");
        U1.setXp(U1.getXp()+1);
        double bonus_gold = U2.getGold() * 0.1;
        int add_gold = (int)bonus_gold;
        U1.setGold(U1.getGold()+add_gold);


    } else if (win1) {
        System.out.println(U2.getName()+" "+"WON!");
        U2.setXp(U2.getXp()+1);
        double bonus_gold = U1.getGold() * 0.1;
        int add_gold = (int)bonus_gold;
        U2.setGold(U2.getGold()+add_gold);
    }
    else{
        System.out.println("DRAW");
    }
    //printing the status of each profile
    //[Attacking Player] XP: [new XP value] gold coins: [new gold coin value]
    //[Defending Player] XP: [new XP value] gold coins: [new gold coin value]
    System.out.println(U1.getName()+" "+"XP: "+U1.getXp()+" "+"Gold coins: "+U1.getGold());
    System.out.println(U2.getName()+" "+"XP: "+U2.getXp()+" "+"Gold coins: "+U2.getGold());

}


}
