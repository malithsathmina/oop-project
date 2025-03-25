package OOpProgect;

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

    
}
