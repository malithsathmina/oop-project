package OOpProgect;

public class Artefacts implements Equipment{
    //add Excalibur to given soidger and decrease gold
    public static int Excalibur(Army soidger, int gold) {
        if(gold>=150) {
            soidger.setAttack(soidger.getAttack() + 2);
            soidger.setArtefacts();
            soidger.setPrice(soidger.getPrice()+30);
            return gold-150;
        }
        else {
            return gold;
        }

    }
    //add Amulet to given soidger and decrease gold
    public static int Amulet(Army soidger,int gold) {
        if(gold>=200) {
            soidger.setAttack(soidger.getAttack() + 1);
            soidger.setDefence(soidger.getDefence() -1);
            soidger.setHealth(soidger.getHealth() + 1);
            soidger.setSpeed(soidger.getSpeed() + 1);
            soidger.setArtefacts();
            soidger.setPrice(soidger.getPrice()+40);
            return gold-200;
        }
        else {
            return gold;
        }
    }
    //add Crystal to given soidger and decrease gold
    public static int Crystal(Army soidger,int gold) {
        if (gold >= 210) {
            soidger.setAttack(soidger.getAttack() + 2);
            soidger.setDefence(soidger.getDefence() + 1);
            soidger.setHealth(soidger.getHealth() - 1);
            soidger.setSpeed(soidger.getSpeed() - 1);
            soidger.setArtefacts();
            soidger.setPrice(soidger.getPrice()+42);
            return gold - 210;
        } else {
            return gold;
        }
    }
    //print the details of Artefacts
    public static void printArtefacts(){
        System.out.println("-------------------");
        System.out.println(">>>> Artefacts <<<<");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("<<<< Number 1 >>>>\n-> Excalibur\n-> 150 golds\n-> Attack: +2\n");
        System.out.println("");
        System.out.println("<<<< Number 2 >>>>\n-> Amulet\n-> 200 golds\n-> Attack: +1\n-> Defence: -1\n-> Health: +1\n-> Speed: +1\n");
        System.out.println("");
        System.out.println("<<<< Number 3 >>>>\n-> Crystal\n-> 210 golds\n-> Attack: +2\n-> Defence: +1\n-> Health: -1\n-> Speed: -1\n");
        System.out.println(">>> Please enter the number which you want to add\n>>> For exit enter number: 4 ");
    }
}
