public class Player extends MonopolyGame {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int rollDices(Dice d1, Dice d2) {
        d1.roll();
        d2.roll();
        return d1.getFaceValue() + d2.getFaceValue();
    }
}
