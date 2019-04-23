public class Player extends MonopolyGame {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int rollDice(Dice d) {
        d.roll();
        return d.getFaceValue();
    }
}
