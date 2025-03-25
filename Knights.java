package OOpProgect;

import OOpProgect.Army;

public class Knights implements Army {
    // Attributes of army characters.
    private String Name;        // Type of the knight
    private int Price;          // Value of knight in gold
    private double Attack;      // Attacking power
    private double Defence;     // Defence status of knight
    private double Health;      // Health value
    private double Speed;       // Attacking speed
    private String Category;    // Category of the knight

    // Updated features for army.
    private boolean armer = false;      // Whether the knight is armed
    private boolean artefacts = false;  // Whether the knight has artefacts

    // Constructor for creating knight objects.
    public Knights(String Name, int Price, double Attack, double Defence, double Health, double Speed, String Category) {
        this.Name = Name;
        this.Price = Price;
        this.Attack = Attack;
        this.Defence = Defence;
        this.Health = Health;
        this.Speed = Speed;
        this.Category = Category;
    }
       // Method to print details of different types of knights.
    public static void print() {
        // Printing details of different knight types
        Army.printDetails(Squire());
        Army.printDetails(Cavalier());
        Army.printDetails(Templar());
        Army.printDetails(Zoro());
        Army.printDetails(Swiftblade());
    }

    // Creating different types of knights.
    public static Knights Squire() {
        // Creating a Squire knight
        Knights Sq = new Knights("Squire", 85, 8.0, 9.0, 7.0, 8.0, "Marshlanders");
        return Sq;
    }
    public static Knights Cavalier() {
        // Creating a Cavalier knight
        Knights Ca = new Knights("Cavalier", 110, 10.0, 12.0, 7.0, 10.0, "Highlanders");
        return Ca;
    }

    public static Knights Templar() {
        // Creating a Templar knight
        Knights Te = new Knights("Templar", 155, 14.0, 16.0, 12.0, 12.0, "Sunchildren");
        return Te;
    }

    public static Knights Zoro() {
        // Creating a Zoro knight
        Knights Zr = new Knights("Zoro", 180, 17.0, 16.0, 13.0, 14.0, "Highlanders");
        return Zr;
    }

    public static Knights Swiftblade() {
        // Creating a Swiftblade knight
        Knights Sw = new Knights("Swiftblade", 250, 18.0, 20.0, 17.0, 13.0, "Marshlanders");
        return Sw;
    }

    // Getters to access attributes of knights.
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

    // Setters to set the attributes of knights.
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
