import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PlayerTest {

    @Test
    void playerRollTwoDices() {
        Player p = new Player("John");
        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6);
        int score = 0;
        score += p.rollDices(d1, d2);
        System.out.println(p.getName() + " a obtenu un score de : " + score);
        assert(score >= 2 && score <= 12);
    }

}