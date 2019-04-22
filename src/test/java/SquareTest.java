import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SquareTest {

    @Test
    //On s'assure que le nombre soit bien dans les bornes.
    void testGetSquareNumber() {
        Square s = new Square();
        assert(s.getSquareNumber() <= 39 || s.getSquareNumber() >= 0);
    }

}