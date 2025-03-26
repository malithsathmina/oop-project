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

    
}
