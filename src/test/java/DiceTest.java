import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DiceTest {

    @Test
    void rollDice() {
        int nbSides = 6;
        Dice d = new Dice(nbSides);
        d.roll();
        assert(d.getFaceValue() >= 0 || d.getFaceValue() <= nbSides);
    }

}