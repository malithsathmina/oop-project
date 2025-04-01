package OOpProgect;


import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main implements Serializable {
    //create a method to save the list of users uesing Serialization
    public static void serializeData(ArrayList<UserProfile> myArray) {
        try (ObjectOutputStream myFile = new ObjectOutputStream(new FileOutputStream("data_file.ser"))) {
            myFile.writeObject(myArray);
            System.out.println("Serialization successful. User object saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //create a method to get the list of users from file
    public static ArrayList<UserProfile> deserializeData() {
        try (ObjectInputStream serializeFile = new ObjectInputStream(new FileInputStream("data_file.ser"))) {
            Object temp = serializeFile.readObject();
            if (temp != null && temp instanceof ArrayList<?>) {
                return (ArrayList<UserProfile>) temp;
            } else {
                System.out.println("Deserialization failed. Unexpected object type.");
            }
        } catch (FileNotFoundException ignored) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*
    create a metod to choose the opponent and check whether user can play
    if user can play do the battle
     */
    public static void battle (UserProfile user){
        Scanner scanner=new Scanner(System.in);
        boolean val=true;
        //check whether 5 soldier are there
        Army[] arr=user.getArmy();
        for (Army temp:arr){
            if(temp==null){
                val=false;
                break;
            }
        }
        //if 5 soldier are there execute this code bolk
        //else print massage
        if(val){
            ArrayList<UserProfile> array =UserProfile.getArray();
            ArrayList<UserProfile> array2=new ArrayList<UserProfile>();
            boolean value=true;
            int count=0;
            for(UserProfile temp:array){
                //check the player has 5 soldiers
                for (Army i:temp.getArmy()){
                    if(i==null){
                        value=false;
                        break;
                    }
                }
                //don't add user itself to array2
                if (temp.getName().equals(user.getName()) && user.getUserName().equals(temp.getUserName())){
                    value=false;
                }
                //put sutable players in to array2 for display to current user and print some details
                if(value){
                    array2.add(temp);
                    System.out.println(count+":  "+temp.getName());
                    count++;
                    System.out.println("XP : "+temp.getXp());
                    for (Army i:temp.getArmy()){
                        System.out.println(i.getName());
                    }
                    System.out.println("");

                }
                value=true;

            }
            //get curent user's input and add player to bettle or exit
            System.out.println("Enter the player number \nIf you want to exit enter -1");
            try {
                int num=scanner.nextInt();
                if(num<=count && num>=0){
                    //do the battle
                    Fight.game(user,array2.get(num),array2.get(num).getLand());
                } else if (num==-1) {

                }else {
                    System.out.println("!!! Invalid input !!!");
                }
            }catch (InputMismatchException e) {
                System.err.println("!!! Invalid integer format !!! " );
                scanner.next();
            }


        }else {
            System.out.println("You can't fight.Your army isn't full !!!");
            System.out.println("");
        }


    }
    
}

