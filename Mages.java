package OOpProgect;

public class Mages implements Army {
    // Attributes of army characters.
    private String Name;        // Type of the mage
    private int Price;          // Value of mage in gold
    private double Attack;      // Attacking power
    private double Defence;     // Defence status of mage
    private double Health;      // Health value
    private double Speed;       // Attacking speed
    private String Category;    // Category of the mage

    // Updated features for army.
    private boolean armer = false;      // Whether the mage is armed
    private boolean artefacts = false;  // Whether the mage has artefacts

    // Constructor for creating mage objects.
    public Mages(String Name, int Price, double Attack, double Defence, double Health, double Speed, String Category) {
        this.Name = Name;
        this.Price = Price;
        this.Attack = Attack;
        this.Defence = Defence;
        this.Health = Health;
        this.Speed = Speed;
        this.Category = Category;
    }

    // Method to print details of different types of mages.
    public static void print() {
        // Printing details of different mage types
        Army.printDetails(Warlock());
        Army.printDetails(Illusionist());
        Army.printDetails(Enchanter());
        Army.printDetails(Conjurer());
        Army.printDetails(Eldritch());
    }

    // Creating different types of mages.
    public static Mages Warlock() {
        // Creating a Warlock mage
        Mages Wl = new Mages("Warlock", 100, 12.0, 7.0, 10.0, 12.0, "Marshlanders");
        return Wl;
    }

    public static Mages Illusionist() {
        // Creating an Illusionist mage
        Mages Il = new Mages("Illusionist", 120, 13.0, 8.0, 12.0, 14.0, "Mystics");
        return Il;
    }

    public static Mages Enchanter() {
        // Creating an Enchanter mage
        Mages Enc = new Mages("Enchanter", 160, 16.0, 10.0, 13.0, 16.0, "Highlanders");
        return Enc;
    }

    public static Mages Conjurer() {
        // Creating a Conjurer mage
        Mages Cnj = new Mages("Conjurer", 195, 18.0, 15.0, 14.0, 12.0, "Highlanders");
        return Cnj;
    }

    public static Mages Eldritch() {
        // Creating an Eldritch mage
        Mages Edl = new Mages("Eldritch", 270, 19.0, 17.0, 18.0, 14.0, "Mystics");
        return Edl;
    }

    // Getters to access attributes of mages.
    public String getCategory() {
        return Category;
    }

    public int getPrice() {
        return Price;
    }

    public String getName() {
        return Name;
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

    public boolean getArmer() {
        return armer;
    }

    public boolean getArtefacts() {
        return artefacts;
    }

    // Setters to set the attributes of mages.
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
