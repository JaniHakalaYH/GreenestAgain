package GreenestAgain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CactusTest {

    Cactus cactus = new Cactus("pelle", 1);
    @Test
    void calculateNutrition() {
        assert (cactus.calculateNutrition() == 0.02);
        assert (cactus.calculateNutrition() != 0.7);
    }
}