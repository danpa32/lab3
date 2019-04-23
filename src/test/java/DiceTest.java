import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DiceTest {

    @Test
    void rollDice() {
        int nbSides = 6;
        Dice d = new Dice(nbSides);
        d.roll();
        System.out.println("Score obtenu : " + d.getFaceValue());
        assert(d.getFaceValue() >= 1 && d.getFaceValue() <= nbSides);
    }

}