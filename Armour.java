package OOpProgect;

public class Armour implements Equipment{
    //add Chainmail to given soidger and decrease gold
    public static int Chainmail(Army soidger, int gold) {
        if(gold>=70) {
            soidger.setDefence(soidger.getDefence() + 1);
            soidger.setSpeed(soidger.getSpeed() - 1);
            soidger.setArmer();
            soidger.setPrice(soidger.getPrice()+14);
            return gold-70;
        }
        else {
            return gold;
        }

    }
    //add Regalia to given soidger and decrease gold
    public static int Regalia(Army soidger,int gold) {
        if(gold>=105) {
            soidger.setDefence(soidger.getDefence() + 1);
            soidger.setArmer();
            soidger.setPrice(soidger.getPrice()+21);
            return gold-105;
        }
        else {
            return gold;
        }
    }
    //add Fleece to given soidger and decrease gold
    public static int Fleece(Army soidger,int gold) {
        if(gold>=150) {
            soidger.setDefence(soidger.getDefence() + 2);
            soidger.setSpeed(soidger.getSpeed() - 1);
            soidger.setHealth(soidger.getHealth() + 1);
            soidger.setArmer();
            soidger.setPrice(soidger.getPrice()+30);
            return gold-150;
        }
        else {
            return gold;
        }

    }
    //print the details of Armours
    public static void printArmours(){
        System.out.println("-----------------");
        System.out.println(">>>> Armours <<<<");
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("<<<< Number 1 >>>>\n-> Chainmail\n-> 70 golds\n-> Defence: +1\n-> Speed: -1\n");
        System.out.println("");
        System.out.println("<<<< Number 2 >>>>\n-> Regalia\n-> 105 golds\n-> Defence: +1\n");
        System.out.println("");
        System.out.println("<<<< Number 3 >>>>\n-> Fleece\n-> 150 golds\n-> Defence: +2\n-> Health: +1\n-> Speed: -1\n");
        System.out.println(">>> Please enter the number which you want to add ");
    }



}
