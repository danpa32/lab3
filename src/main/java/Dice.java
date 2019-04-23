import java.util.Random;

public class Dice extends MonopolyGame {

    private int nbSides;
    private int faceValue;

    public Dice(int nbSides) {
        this.nbSides = nbSides;
        this.faceValue = 1;
    }

    public int getNbSides() {
        return this.nbSides;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public void roll() {
        Random r = new Random();
        this.faceValue = r.nextInt(this.nbSides) + 1;
    }

}
