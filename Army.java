package OOpProgect;

import java.io.Serializable;

public interface Army extends Serializable{
    static void printDetails(Army temp){
        System.out.println("Name is :" + temp.getName() );
        System.out.println("Price : " + temp.getPrice() );
        System.out.println("Attack :" + temp.getAttack() );
        System.out.println("Defence :" + temp.getDefence() );
        System.out.println("Health :" + temp.getHealth() );
        System.out.println("Speed :" + temp.getSpeed() );
        System.out.println("Land :" + temp.getCategory() );
        System.out.println("");
    }

    public int getPrice();
    public boolean getArmer();
    public boolean getArtefacts();

    public double getAttack();

    public double getDefence();

    public double getHealth();

    public double getSpeed();
    public String getCategory();
    public String getName();
    // Setters
    public void setPrice(int price);

    public void setAttack(double attack);

    public void setDefence(double defence);

    public void setHealth(double health);

    public void setSpeed(double speed);
    public void setArmer();
    public void setArtefacts();


}