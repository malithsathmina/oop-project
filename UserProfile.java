package OOpProgect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

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
    
}
