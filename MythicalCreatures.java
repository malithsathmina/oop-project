package OOpProgect;

public class MythicalCreatures implements Army {
    // Attributes of army characters.
    private String Name;        // Type of the mythical creature
    private int Price;          // Value of mythical creature in gold
    private double Attack;      // Attacking power
    private double Defence;     // Defence status of mythical creature
    private double Health;      // Health value
    private double Speed;       // Attacking speed
    private String Category;    // Category of the mythical creature

    // Updated features for army.
    private boolean armer = false;      // Whether the mythical creature is armed
    private boolean artefacts = false;  // Whether the mythical creature has artefacts

    // Constructor for creating mythical creature objects.
    public MythicalCreatures(String Name, int Price, double Attack, double Defence, double Health, double Speed, String Category) {
        this.Name = Name;
        this.Price = Price;
        this.Attack = Attack;
        this.Defence = Defence;
        this.Health = Health;
        this.Speed = Speed;
        this.Category = Category;
    }

    
}