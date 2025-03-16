package OOpProgect;

public class Archers implements Army {
    // Attributes of army characters.
    private String Name;        // Type of the archer
    private int Price;          // Value of archer in gold
    private double Attack;      // Attacking power
    private double Defence;     // Defence status of archer
    private double Health;      // Health value
    private double Speed;       // Attacking speed
    private String Category;    // Category of the archer

    // Updated features for army.
    private boolean armer = false;
    private boolean artefacts = false;

    // Constructor for creating archer objects.
    public Archers(String Name, int Price, double Attack, double Defence, double Health, double Speed, String Category) {
        this.Name = Name;
        this.Price = Price;
        this.Attack = Attack;
        this.Defence = Defence;
        this.Health = Health;
        this.Speed = Speed;
        this.Category = Category;
    }

    // Method to print details of different types of archers.
    public static void print() {
        // Printing details of different archer types
        Army.printDetails(Shooter());
        Army.printDetails(Ranger());
        Army.printDetails(Sunfire());
        Army.printDetails(Zing());
        Army.printDetails(Saggitarius());
    }

    // Creating different types of archers.
    public static Archers Shooter() {
        // Creating a Shooter archer
        Archers shooter = new Archers("Shooter", 80, 11.0, 4.0, 6.0, 9.0, "Highlanders");
        return shooter;
    }

    public static Archers Ranger() {
        // Creating a Ranger archer
        Archers ranger = new Archers("Ranger", 115, 14.0, 5.0, 8.0, 10.0, "Highlanders");
        return ranger;
    }

    public static Archers Sunfire() {
        // Creating a Sunfire archer
        Archers sunfire = new Archers("Sunfire", 160, 15.0, 5.0, 7.0, 14.0, "Sunchildren");
        return sunfire;
    }

    public static Archers Zing() {
        // Creating a Zing archer
        Archers zing = new Archers("Zing", 200, 16.0, 9.0, 11.0, 14.0, "Sunchildren");
        return zing;
    }

    public static Archers Saggitarius() {
        // Creating a Saggitarius archer
        Archers saggitarius = new Archers("Saggitarius", 230, 18.0, 7.0, 12.0, 17.0, "Mystics");
        return saggitarius;
    }

    // Getters to access attributes of archers.
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

    // Setters to set the attributes of archers.
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