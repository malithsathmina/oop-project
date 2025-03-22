package OOpProgect;

//This class and its methods use to take some supporting information for the battle.
import java.util.Queue;

import OOpProgect.Army;

import java.util.LinkedList;
import java.util.Arrays;
public  class Battle {

  //take the character who has minimum defence value.
  public static Army getMinDefence(UserProfile UP){

      double D1 = UP.getArcher().getDefence();
      double D2 = UP.getKnight().getDefence();
      double D3 = UP.getMage().getDefence();
      double D4 = UP.getHealer().getDefence();
      double D5 = UP.getMythical_Creature().getDefence();
      double[] Defence = {D4,D5,D1,D2,D3};
      double min = 40 ;
      //find the minimum defence value.
      for(int i =0 ; i <5 ;i++ ){
          //checking living(dead) status.
          if (min > Defence[i] && Defence[i] >0 ){
              min = Defence[i];
          }
      }
      //return character considering order.
      if (min == D4){
          return UP.getHealer();
      }
      else if (min == D5) {
          return UP.getMythical_Creature();
      }
      else if (min == D1) {
          return UP.getArcher();
      }
      else if (min == D2 ){
          return UP.getKnight();
      }
      else{
          return UP.getMage();
      }
  }
  //take the character who has maximum speed value.
  public static Queue<Army> getMaxSpeed(UserProfile UP){
      Queue<Army> armyQue = new LinkedList<>();
      double S1 = UP.getArcher().getSpeed();
      double S2 = UP.getKnight().getSpeed();
      double S3 = UP.getMage().getSpeed();
      double S4 = UP.getHealer().getSpeed();
      double S5 = UP.getMythical_Creature().getSpeed();
      double[] Speed = {S1,S2,S5,S3,S4};
      double max = 0 ;

      Arrays.sort(Speed);

      for(int i=4;i>=0;i--){
          max=Speed[i];
          if (max == S1){
              armyQue.offer(UP.getArcher());
              S1 = 0;
          }
          else if (max == S2) {
              armyQue.offer(UP.getKnight());
              S2=0;
          }
          else if (max == S5) {
              armyQue.offer(UP.getMythical_Creature());
              S5=0;
          }
          else if (max == S3 ){
              armyQue.offer(UP.getMage());
              S3=0;
          }
          else{
              armyQue.offer(UP.getHealer());
              S4=0;
          }
      }
      return armyQue;
  }

  //take the character who has minimum health value.
  //this use to heal their characters.
  public static Army getMinHealth(UserProfile UP){
    double H1 = UP.getArcher().getDefence();
    double H2 = UP.getKnight().getDefence();
    double H3 = UP.getMage().getDefence();
    double H4 = UP.getHealer().getDefence();
    double H5 = UP.getMythical_Creature().getDefence();
    double[] Heal = {H1,H2,H3,H4,H5};
    double min = 25 ;
    for(int i =0 ; i <5 ;i++ ){
        if (min > Heal[i] && Heal[i]>0){
            min = Heal[i];
        }
    }
    //return the character to the given order.
    if (min == H1){
        return UP.getArcher();
    }
    else if (min == H2) {
        return UP.getKnight();
    }
    else if (min == H3) {
        return UP.getMage();
    }
    else if (min == H4 ){
        return UP.getHealer();
    }
    else{
        return UP.getMythical_Creature();
    }
}


}