package OOpProgect;

import OOpProgect.Army;

public class Healers implements Army {
    // Attributes of army characters.
    private String Name;        // Type of the healer
    private int Price;          // Value of healer in gold
    private double Attack;      // Attacking power
    private double Defence;     // Defence status of healer
    private double Health;      // Health value
    private double Speed;       // Attacking speed
    private String Category;    // Category of the healer

    // Updated features for army.
    private boolean armer = false;      // Whether the healer is armed
    private boolean artefacts = false;  // Whether the healer has artefacts

    // Constructor for creating healer objects.
    public Healers(String Name, int Price, double Attack, double Defence, double Health, double Speed, String Category) {
        this.Name = Name;
        this.Price = Price;
        this.Attack = Attack;
        this.Defence = Defence;
        this.Health = Health;
        this.Speed = Speed;
        this.Category = Category;
    }
// Method to print details of different types of healers.
    public static void print() {
        // Printing details of different healer types
        Army.printDetails(Soother());
        Army.printDetails(Medic());
        Army.printDetails(Alchemist());
        Army.printDetails(Saint());
        Army.printDetails(Lightbringer());
    }

    // Creating different types of healers.
    public static Healers Soother() {
        // Creating a Soother healer
        Healers soother = new Healers("Soother", 95, 10.0, 8.0, 9.0, 6.0, "Sunchildren");
        return soother;
    }

    public static Healers Medic() {
        // Creating a Medic healer
        Healers medic = new Healers("Medic", 125, 12.0, 9.0, 10.0, 7.0, "Highlanders");
        return medic;
    }

    public static Healers Alchemist() {
        // Creating an Alchemist healer
        Healers alchemist = new Healers("Alchemist", 150, 13.0, 13.0, 13.0, 13.0, "Marshlanders");
        return alchemist;
    }

    public static Healers Saint() {
        // Creating a Saint healer
        Healers saint = new Healers("Saint", 200, 16.0, 14.0, 17.0, 9.0, "Mystics");
        return saint;
    }

    public static Healers Lightbringer() {
        // Creating a Lightbringer healer
        Healers lightbringer = new Healers("Lightbringer", 260, 17.0, 15.0, 19.0, 12.0, "Sunchildren");
        return lightbringer;
    }
    // Getters to access attributes of healers.
    public String getCategory() {
        return Category;
    }

    public int getPrice() {
        return Price;
    }

    public double getAttack() {
        return Attack;
    }

    public double getDefence() {
        return Defence;
    }

    public double getHealth() {
        return Health;
    }

    public double getSpeed() {
        return Speed;
    }

    public String getName() {
        return Name;
    }

    public boolean getArmer() {
        return armer;
    }

    public boolean getArtefacts() {
        return artefacts;
    }

    // Setters to set the attributes of healers.
    public void setPrice(int price) {
        this.Price = price;
    }

    public void setAttack(double attack) {
        this.Attack = attack;
    }

    public void setDefence(double defence) {
        this.Defence = defence;
    }

    public void setHealth(double health) {
        this.Health = health;
    }

    public void setSpeed(double speed) {
        this.Speed = speed;
    }

    public void setArmer() {
        armer = true;
    }

    public void setArtefacts() {
        artefacts = true;
    }

    
}
