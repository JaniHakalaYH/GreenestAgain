package GreenestAgain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivoreTest {

    Carnivore carnivore = new Carnivore("Fabian", 0.5);

    @Test
    void calculateNutrition() {
        assert (carnivore.calculateNutrition() == 0.2);
        assert (carnivore.calculateNutrition() != 0.3);
    }
}