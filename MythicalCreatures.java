package OOpProgect;

import OOpProgect.Army;

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

    // Method to print details of different types of mythical creatures.
    public static void print() {
        // Printing details of different mythical creature types
        Army.printDetails(Dragon());
        Army.printDetails(Basilisk());
        Army.printDetails(Hydra());
        Army.printDetails(Phoenix());
        Army.printDetails(Pegasus());
    }

    // Creating different types of mythical creatures.
    public static MythicalCreatures Dragon() {
        // Creating a Dragon mythical creature
        MythicalCreatures dragon = new MythicalCreatures("Dragon", 120, 12.0, 14.0, 15.0, 8.0, "Sunchildren");
        return dragon;
    }

    public static MythicalCreatures Basilisk() {
        // Creating a Basilisk mythical creature
        MythicalCreatures basilisk = new MythicalCreatures("Basilisk", 165, 15.0, 11.0, 10.0, 12.0, "Marshlanders");
        return basilisk;
    }

    public static MythicalCreatures Hydra() {
        // Creating a Hydra mythical creature
        MythicalCreatures hydra = new MythicalCreatures("Hydra", 205, 12.0, 16.0, 15.0, 11.0, "Marshlanders");
        return hydra;
    }

    public static MythicalCreatures Phoenix() {
        // Creating a Phoenix mythical creature
        MythicalCreatures phoenix = new MythicalCreatures("Phoenix", 275, 17.0, 13.0, 17.0, 19.0, "Sunchildren");
        return phoenix;
    }

    public static MythicalCreatures Pegasus() {
        // Creating a Pegasus mythical creature
        MythicalCreatures pegasus = new MythicalCreatures("Pegasus", 340, 14.0, 18.0, 20.0, 20.0, "Mystics");
        return pegasus;
    }

    
}