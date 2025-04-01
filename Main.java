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
    //after the loging to the user profile ask the function that user can do
    //and get user input
    public static void afterLogging(UserProfile user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println(">>>>>>>>>>>>> MAIN MENU <<<<<<<<<<<<<<");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("-> To battle press number          : 1 ");
        System.out.println("-> To add the army press number    : 2 ");
        System.out.println("-> To sell the army press number   : 3 ");
        System.out.println("-> To upgrade the army press number: 4 ");
        System.out.println("_> To change name press number     : 5 ");
        System.out.println("-> Back and logout press number    : 6 ");

        String num=scanner.next();
        //if input is 1 do battle
        if (num.equals("1")){
            battle(user);
            Main.afterLogging(user);
        }
        //if input is 2 add soldier to army
        else if (num.equals("2")){
            //do this adding process until user want to end adding
            while (true) {
                System.out.println("Your gold is: "+user.getGold());
                //print starus of army
                boolean value=user.printArmy();
                //if user can add soldier execuite this code lines
                if (value) {
                    System.out.println("To add the troop press relevant number which is in-front of the name!!!\nTo exit press number  : 5");
                    try {
                        //get the user input
                        int num_2 = scanner.nextInt();
                    /*
                    according to the user input print the relevant details
                    and get next input from user
                    according to the user next input add soldier to user's army
                     */
                        if (num_2 == 0) {
                            if(user.getArmy()[0]==null) {
                                System.out.println("<<< Details Of Archers >>>");                      //army
                                Archers.print();
                                System.out.println("");
                                System.out.println("---Please Enter The Character Number--- ");   //Enter the troop number
                                System.out.println("");
                                System.out.println("-> Shooter:         0");
                                System.out.println("-> Ranger:          1");
                                System.out.println("-> SunFire:         2");
                                System.out.println("-> Zing:            3");
                                System.out.println("-> Saggitarius:     4");
                                int num_3 = scanner.nextInt();
                                user.addAcher(num_3);
                            }else {
                                System.out.println("Wrong Input!!!");
                            }
                        } else if (num_2 == 1) {
                            if(user.getArmy()[1]==null) {
                                System.out.println("<<< Details Of Knights >>>");
                                Knights.print();
                                System.out.println("");
                                System.out.println("---Please Enter The Character Number---");
                                System.out.println("");
                                System.out.println("-> Squire:            0");
                                System.out.println("-> Cavalier:          1");
                                System.out.println("-> Templar:           2");
                                System.out.println("-> Zoro:              3");
                                System.out.println("-> Swiftblade:        4");
                                int num_3 = scanner.nextInt();
                                user.addKnight(num_3);
                            }else {
                                System.out.println("Wrong Input!!!");
                            }
                        } else if (num_2 == 2) {
                            if(user.getArmy()[2]==null) {
                                System.out.println("<<< Details Of Mages >>>");
                                Mages.print();
                                System.out.println("");
                                System.out.println("---Please Enter The Character Number---");
                                System.out.println("");
                                System.out.println("-> Warlock:           0");
                                System.out.println("-> Illusionist:       1");
                                System.out.println("-> Enchanter:         2");
                                System.out.println("-> Conjurer:          3");
                                System.out.println("-> Eldritch:          4");
                                int num_3 = scanner.nextInt();
                                user.addMages(num_3);
                            }else {
                                System.out.println("Wrong Input!!!");
                            }
                        } else if (num_2 == 3) {
                            if(user.getArmy()[3]==null) {
                                System.out.println("<<< Details Of Healers >>>");
                                Healers.print();
                                System.out.println("");
                                System.out.println("---Please Enter The Character Number---");
                                System.out.println("");
                                System.out.println("-> Soother:           0");
                                System.out.println("-> Medic:             1");
                                System.out.println("-> Alchemist:         2");
                                System.out.println("-> Saint:             3");
                                System.out.println("-> Lightbringer:      4");
                                int num_3 = scanner.nextInt();
                                user.addHealers(num_3);
                            }else {
                                System.out.println("Wrong Input!!!");
                            }
                        } else if(num_2==4){
                            if(user.getArmy()[4]==null) {
                                System.out.println("<<< Details Of Mythical Creature >>>");
                                MythicalCreatures.print();
                                System.out.println("");
                                System.out.println("---Please Enter The Character Number---");
                                System.out.println("");
                                System.out.println("-> Dragon:            0");
                                System.out.println("-> Basilisk:          1");
                                System.out.println("-> Hydra:             2");
                                System.out.println("-> Phoenix:           3");
                                System.out.println("-> Pegasus:           4");
                                int num_3 = scanner.nextInt();
                                user.addMythicalCreature(num_3);
                            }else {
                                System.out.println("Wrong Input!!!");
                            }
                        }else {
                            //if input is 5 exit from while loop
                            break;
                        }


                    }catch (InputMismatchException e) {
                        System.err.println("!!! Invalid Input !!!" );
                        scanner.next();
                    }

                } else {
                    System.out.println(">>> To continue press: c");
                    String latter = scanner.next();
                    break;
                }
            }
            //go to the mane again
            Main.afterLogging(user);
        //if input is 3 go to delete soldier from army
        }else if(num.equals("3")) {
            //print the user's army
            user.printArmyDel();
            System.out.println("!!! You can sell only character which is brought by you !!!");
            System.out.println(">>> Enter the number of character ");
            System.out.println(">>> To exit press number: -1");
            boolean value=true;
            while (value) {
                try {
                    int num_2=scanner.nextInt();
                    if (num_2==-1){

                    }else if(num_2<5 && num_2>=0) {
                        //call delete method
                        user.delete(num_2);
                    }else if(num_2>4 && num_2<0){
                        System.err.println("!!! Invalid integer !!! ");
                    }
                    value =false;
                }catch (InputMismatchException a) {
                    System.err.println("!!! Invalid integer format !!! ");
                    scanner.next();
                    user.printArmyDel();
                    System.out.println("To exit press -1");
                }

            }
            Main.afterLogging(user);


        }
        //if input is 4 to add armour and artifacts
        else if(num.equals("4")){
            System.out.println("Your gold is: "+user.getGold());
            //print the army which has not armour or artifacts
            boolean val=user.printArmy(user.getGold()>70);
            if(val){
                boolean value=true;
                while (value) {
                    try {
                        //get the user input
                        int num_3 = scanner.nextInt();
                        //according to the input add armour or artifact
                        if (num_3 < 5 && num_3 >= 0) {
                            Armour.printArmours();
                            System.out.println(">>> To exit press number: -1");
                            int num_4 = scanner.nextInt();
                            if (num_4 == 1) {
                                user.setGold(Armour.Chainmail(user.getArmy()[num_3], user.getGold()));
                            } else if (num_4 == 2) {
                                user.setGold(Armour.Regalia(user.getArmy()[num_3], user.getGold()));
                            } else if (num_4 == 3) {
                                user.setGold(Armour.Fleece(user.getArmy()[num_3], user.getGold()));
                            }
                        } else if (num_3 < 10 && num_3 > 4) {
                            Artefacts.printArtefacts();
                            System.out.println(">>> To exit press number: -1");
                            int num_4 = scanner.nextInt();
                            if (num_4 == 1) {
                                user.setGold(Artefacts.Excalibur(user.getArmy()[num_3 - 5], user.getGold()));
                            } else if (num_4 == 2) {
                                user.setGold(Artefacts.Amulet(user.getArmy()[num_3 - 5], user.getGold()));
                            } else if (num_4 == 3) {
                                user.setGold(Artefacts.Crystal(user.getArmy()[num_3 - 5], user.getGold()));
                            }

                        }
                        value = false;
                    } catch (InputMismatchException e) {
                        System.err.println("!!! Invalid integer format !!! ");
                        value = true;
                        scanner.next();
                        user.printArmy(true);
                    }
                }


            }else {
                System.out.println("!!! You can't add another Equipment !!!");
            }
            //go to the mane again
            Main.afterLogging(user);
        }
        //if input is 5 change user's name
        else if(num.equals("5")){
            System.out.println(">>> Enter the new name :");
            String name=scanner.next();
            user.setName(name);
        } else if (num.equals("6")) {
            
        } else {
            System.out.println("!!! Invalid number !!!");
            Main.afterLogging(user);

        }
    }
    
}

