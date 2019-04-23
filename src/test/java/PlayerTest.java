import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PlayerTest {

    @Test
    void playerRollOneDice() {
        Player p = new Player("John");
        Dice d = new Dice(6);
        int score = 0;
        score += p.rollDice(d);
        System.out.println(p.getName() + " a obtenu un score de : " + score);
        assert(score >= 1 && score <= 6);
    }

    @Test
    void playerRollTwoDices() {
        Player p = new Player("John");
        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6);
        int score = 0;
        score += p.rollDice(d1);
        score += p.rollDice(d2);
        System.out.println(p.getName() + " a obtenu un score de : " + score);
        assert(score >= 2 && score <= 12);
    }

}