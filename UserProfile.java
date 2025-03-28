package OOpProgect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import OOpProgect.Armour;
import OOpProgect.Army;
import OOpProgect.Artefacts;

public class UserProfile implements Serializable {
    private static ArrayList<UserProfile> users=new ArrayList();
    private String name;
    private int xp = 0;
    private int gold = 500;
    private String userName;
    private String land;

    /*
    0-Archers
    1-Knights
    2-Mages
    3-Healers
    4-Mythical Creatures
     */
    private Army[] army = new Army[5];
    //constructor
    public UserProfile(String name,String pas,String land){
        this.name=name;
        userName=pas;
        this.land=land;
        users.add(this);
    }
    //defoult player
    public static void defoult(){
        UserProfile temp =new UserProfile("GeraltofRivia","whitewolf","Marshland");
        temp.xp=32;
        temp.gold=2000;
        temp.addAcher(1);
        temp.addKnight(0);
        temp.addMages(0);
        temp.addHealers(1);
        temp.addMythicalCreature(0);
        Armour.Chainmail(temp.army[0],200);
        Artefacts.Amulet(temp.army[3],500);
        temp.gold=215;
    }
    //Getting Army
    public Army getArcher(){
        return army[0];
    }
    public Army getKnight(){
        return army[1];
    }
    public Army getMage(){return army[2];}
    public Army getHealer(){
        return army[3];
    }
    public Army getMythical_Creature(){return army[4];}
    public int getGold(){return gold;}
    public Army[] getArmy(){return army;}
    public String getUserName(){return userName;}
    public int getXp(){return this.xp;}
    public String getName(){return this.name;}
    public String getLand(){
        return land;
    }
    public static ArrayList getArray(){
        return users;
    }
    //Set Army
    public void setName(String name){this.name=name;}
    public void setGold(int gold){
        this.gold=gold;
    }
    public void setXp(int XP){
        this.xp = XP;
    }

}
