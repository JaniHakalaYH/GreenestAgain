package GreenestAgain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm palm = new Palm("Palme",3);
    @Test
    void calculateNutrition() {
        assert(palm.calculateNutrition() == 1.5);
        assert(palm.calculateNutrition() != 7);
    }
}