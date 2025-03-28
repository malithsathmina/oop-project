package OOpProgect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import OOpProgect.Archers;
import OOpProgect.Armour;
import OOpProgect.Army;
import OOpProgect.Artefacts;
import OOpProgect.Mages;

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
public static void setArray(ArrayList<UserProfile> Users){users=Users;}
    //delete the user
    public static void deleteUser(UserProfile temp){users.remove(temp);}
    //add acher
    public void addAcher(int num){
            if (num == 0) {
                Archers A1 = Archers.Shooter();
                if(A1.getPrice()<=gold) {
                gold = gold - A1.getPrice();
                army[0] = A1;
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 1) {
                Archers A2 = Archers.Ranger();
                if(A2.getPrice()<=gold) {
                gold = gold - A2.getPrice();
                army[0] = A2;
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 2) {
                Archers A3 = Archers.Sunfire();
                if(A3.getPrice()<=gold) {
                gold = gold - A3.getPrice();
                army[0] = A3;
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 3) {
                Archers A4 = Archers.Zing();
                if(A4.getPrice()<=gold) {
                gold = gold - A4.getPrice();
                army[0] = A4;
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else { //creating Saggitarius
                Archers A5 = Archers.Saggitarius();
                if(A5.getPrice()<=gold) {
                gold = gold - A5.getPrice();
                army[0] = A5;
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            }

    }
    //add Knight
    public void addKnight(int num){

        if (num == 0) {
            Knights k1 = Knights.Squire();
            if(k1.getPrice()<=gold) {
            army[1] = k1;
            gold = gold - k1.getPrice();
            }else{
                System.out.println("!!! You haven't enough money !!!");
            }
        } else if (num == 1) {
            Knights k2 = Knights.Cavalier();
            if(k2.getPrice()<=gold) {
            army[1] = k2;
            gold = gold - k2.getPrice();
            }else{
                System.out.println("!!! You haven't enough money !!!");
            }
        } else if (num == 2) {
            Knights k3 = Knights.Templar();
            if(k3.getPrice()<=gold) {
            army[1] = k3;
            gold = gold - k3.getPrice();
            }else{
                System.out.println("!!! You haven't enough money !!!");
            }
        } else if (num == 3) {
            Knights k4 = Knights.Zoro();
            if(k4.getPrice()<=gold) {
            army[1] = k4;
            gold = gold - k4.getPrice();
            }else{
                System.out.println("!!! You haven't enough money !!!");
            }
        } else if (num == 4) {
            Knights k5 = Knights.Swiftblade();
            if(k5.getPrice()<=gold) {
            army[1] = k5;
            gold = gold - k5.getPrice();
            }else{
                System.out.println("!!! You haven't enough money !!!");
            }
        } else {
            System.out.println("!!! Wrong Input !!!");
        }
    }
    //add Mages
    public void addMages(int num) {
            if (num == 0) {
                Mages M = Mages.Warlock();
                if(M.getPrice()<=gold) {
                    army[2] = M;
                    gold = gold - M.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 1) {
                Mages M = Mages.Illusionist();
                if(M.getPrice()<=gold) {
                army[2] = M;
                gold = gold - M.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 2) {
                Mages M = Mages.Enchanter();
                if(M.getPrice()<=gold) {
                army[2] = M;
                gold = gold - M.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 3) {
                Mages M = Mages.Conjurer();
                if(M.getPrice()<=gold) {
                army[2] = M;
                gold = gold - M.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else { //creating Eldritch
                Mages M = Mages.Eldritch();
                if(M.getPrice()<=gold) {
                army[2] = M;
                gold = gold - M.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            }
    }
    //add Healers
    public void addHealers(int num) {
            if (num == 0) {
                Healers h = Healers.Soother();
                if(h.getPrice()<=gold) {
                army[3] = h;
                gold = gold - h.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 1) {
                Healers h = Healers.Medic();
                if(h.getPrice()<=gold) {
                army[3] = h;
                gold = gold - h.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 2) {
                Healers h = Healers.Alchemist();
                if(h.getPrice()<=gold) {
                army[3] = h;
                gold = gold - h.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 3) {
                Healers h = Healers.Saint();
                if(h.getPrice()<=gold) {
                army[3] = h;
                gold = gold - h.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else { //creating Lightbringer
                Healers h = Healers.Lightbringer();
                if(h.getPrice()<=gold) {
                army[3] = h;
                gold = gold - h.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            }
    }
    //add Mythical Creature
    public void addMythicalCreature(int num) {
            if (num == 0) {
                MythicalCreatures M1 = MythicalCreatures.Dragon();
                if(M1.getPrice()<=gold) {
                army[4] = M1;
                gold = gold - M1.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 1) {
                MythicalCreatures M2 = MythicalCreatures.Basilisk();
                if(M2.getPrice()<=gold) {
                army[4] = M2;
                gold = gold - M2.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 2) {
                MythicalCreatures M3 = MythicalCreatures.Hydra();
                if(M3.getPrice()<=gold) {
                army[4] = M3;
                gold = gold - M3.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else if (num == 3) {
                MythicalCreatures M4 = MythicalCreatures.Phoenix();
                if(M4.getPrice()<=gold) {
                army[4] = M4;
                gold = gold - M4.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            } else { //creating Pegasus
                MythicalCreatures M5 = MythicalCreatures.Pegasus();
                if(M5.getPrice()<=gold) {
                army[4] = M5;
                gold = gold - M5.getPrice();
                }else{
                    System.out.println("!!! You haven't enough money !!!");
                }
            }

        }



}
