package OOpProgect;

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
