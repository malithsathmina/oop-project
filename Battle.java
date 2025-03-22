package OOpProgect;

//This class and its methods use to take some supporting information for the battle.
import java.util.Queue;
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

}