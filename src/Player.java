public class Player {

    // Player ID (either 1 or 2)
    private int id;
    // Player name
    private String name;

    // Constructor
    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter for player ID
    public int getId() {
        return id;
    }

    // Getter for player name
    public String getName() {
        return name;
    }
}
