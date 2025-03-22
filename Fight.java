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
// This function use to increase the performance of characters considering their category and fighting land.
public static void IncreasePerformance(String land,Army army){

    if (land == "Hillcrest"){  //when attack happen in Hillcrest
        if (army.getCategory() =="Highlanders"){
            army.setAttack((army.getAttack()+1)*1.2);
            army.setDefence(army.getDefence()+1);
        }
        if((army.getCategory()=="Marshlanders") ||(army.getCategory()=="Sunchildren")){
            army.setSpeed(army.getSpeed()-1);
        }
    }

    if (land == "Marshland"){    //when attack happen in Marshland
        if (army.getCategory()=="Marshlanders"){
            army.setDefence(army.getDefence()+2);
        }
        if(army.getCategory()=="Sunchildren"){
            army.setAttack(army.getAttack()-1);
        }
        if (army.getCategory()=="Mystics"){
            army.setSpeed(army.getSpeed()-1);
        }
    }

    if(land == "Desert"){   //when attack happen in Desert
        if(army.getCategory()=="Marshlanders"){
            army.setHealth(army.getHealth()-1);
        }

        if(army.getCategory()=="Sunchildren"){
            army.setAttack(army.getAttack()+1);
        }
    }

    if(land == "Arcane"){   //when attack happen in Arcane
        if(army.getCategory()=="Mystics"){
            army.setAttack(army.getAttack()+2);
        }

        if((army.getCategory()=="Highlanders")||(army.getCategory()=="Marshlanders")){
            army.setSpeed(army.getSpeed()-1);
            army.setDefence(army.getDefence()-1);
        }
    }

}

//this one is the main battle function.
public static void game(UserProfile U1 , UserProfile U2 ,String land){
    //U1 - user profile 1
    //U2 - user profile 2
    //take the stating status of the characters of each profile.
    CopyArmy U1archer = new CopyArmy(U1.getArcher());
    CopyArmy U2archer = new CopyArmy(U2.getArcher());
    CopyArmy U1knight = new CopyArmy(U1.getKnight());
    CopyArmy U2knight = new CopyArmy(U2.getKnight());
    CopyArmy U1mage = new CopyArmy(U1.getMage());
    CopyArmy U2mage = new CopyArmy(U2.getMage());
    CopyArmy U1healer = new CopyArmy(U1.getHealer());
    CopyArmy U2healer = new CopyArmy(U2.getHealer());
    CopyArmy U1mythicalCreature = new CopyArmy(U1.getMythical_Creature());
    CopyArmy U2mythicalCreature = new CopyArmy(U2.getMythical_Creature());


    //increasing performance with respect to the land.
    Fight.IncreasePerformance(land,U1.getArcher());
    Fight.IncreasePerformance(land,U1.getKnight());
    Fight.IncreasePerformance(land,U1.getMage());
    Fight.IncreasePerformance(land,U1.getHealer());
    Fight.IncreasePerformance(land,U1.getMythical_Creature());
    Fight.IncreasePerformance(land,U2.getArcher());
    Fight.IncreasePerformance(land,U2.getKnight());
    Fight.IncreasePerformance(land,U2.getMage());
    Fight.IncreasePerformance(land,U2.getHealer());
    Fight.IncreasePerformance(land,U2.getMythical_Creature());

    int i =1;
    Queue<Army> army1 = Battle.getMaxSpeed(U1);
    Queue<Army> army2 = Battle.getMaxSpeed(U2);
    ArrayList<String> dethArmy1=new ArrayList<>();
    ArrayList<String> dethArmy2=new ArrayList<>();
    while (i<=20 && !((U1.getArcher().getHealth()==0 && U1.getKnight().getHealth()==0 && U1.getMage().getHealth()==0 && U1.getHealer().getHealth()==0 && U1.getMythical_Creature().getHealth()==0)||(U2.getArcher().getHealth()==0 && U2.getKnight().getHealth()==0 && U2.getMage().getHealth()==0 && U2.getHealer().getHealth()==0 && U2.getMythical_Creature().getHealth()==0))){
        System.out.println("-> Turn: "+i);
        if(i%2==1){
            //attacking time of U1 player
            System.out.println("Attacker is "+U1.getName());
            Army fighter;
            for (int num=0;num<5;num++) {
                for (String name : dethArmy1) {
                    if (name.equals(army1.peek().getName())) {
                        army1.remove();
                        break;
                    }
                }
            }

            fighter = army1.peek();
            System.out.print(U1.getName()+ "'s ");

            if(fighter.getClass()!=Healers.class){
                Army defender = Battle.getMinDefence(U2);
                boolean val=Fight.Attack(fighter,defender, U1.getLand());
                if(val){
                    dethArmy2.add(defender.getName());
                }
            }
            else{
                Army receiver = Battle.getMinHealth(U1);
                Fight.HealerAttack(fighter,receiver, U1.getLand());
            }
            army1.offer(army1.poll());

        }

        else{  //attacking time of player 2.
            System.out.println("Attacker is "+U2.getName());
            Army fighter;
            for (int num=0;num<5;num++) {
                for (String name : dethArmy2) {
                    if (name.equals(army2.peek().getName())) {
                        army2.remove();
                        break;
                    }
                }
            }

            fighter = army2.peek();

            System.out.print(U2.getName()+ "'s ");
            if(fighter.getClass()!=Healers.class){
                Army defender = Battle.getMinDefence(U1);
                boolean val=Fight.Attack(fighter,defender, U1.getLand());
                if(val){
                    dethArmy1.add(defender.getName());
                }
            }
            else{
                Army receiver = Battle.getMinHealth(U1);
                Fight.HealerAttack(fighter,receiver, U1.getLand());
            }
            army2.offer(army2.poll());
        }
        i++;
    }
    //wining status
    Fight.Win(U1,U2);

    // set the starting status of the characters of each player profile.
    CopyArmy.SetArmy(U1.getArcher(),U1archer);
    CopyArmy.SetArmy(U2.getArcher(),U2archer);
    CopyArmy.SetArmy(U1.getKnight(),U1knight);
    CopyArmy.SetArmy(U2.getKnight(),U2knight);
    CopyArmy.SetArmy(U1.getMage(),U1mage);
    CopyArmy.SetArmy(U2.getMage(),U2mage);
    CopyArmy.SetArmy(U1.getHealer(),U1healer);
    CopyArmy.SetArmy(U2.getHealer(),U2healer);
    CopyArmy.SetArmy(U1.getMythical_Creature(),U1mythicalCreature);
    CopyArmy.SetArmy(U2.getMythical_Creature(), U2mythicalCreature);

    // remove unnecessary objects.

    U1archer = null;
    U1knight = null;
    U1mage   = null;
    U1healer = null;
    U1mythicalCreature = null;
    U2archer = null;
    U2knight = null;
    U2mage   = null;
    U2healer = null;
    U2mythicalCreature = null;
    System.gc();

}



}
