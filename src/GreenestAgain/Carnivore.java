package GreenestAgain;

import javax.swing.*;

public class Carnivore extends Plant implements PlantInterface{ //Arv och interface

    private final double baseNutrition; //används endast i denna och är konstant, därför private final.

    public Carnivore(String name, double height) {
        super(name, height);
        this.baseNutrition = 0.1;
        this.plantInfo = PlantInfo.CARNIVORE;
    }

    @Override //från interface och polymorfism
    public double calculateNutrition() {
        return baseNutrition + PlantInfo.CARNIVORE.value*this.height;
    }

    @Override
    public void nutritionOutput() {
        JOptionPane.showMessageDialog(null,"Your "+this.plantInfo.type+" needs "+calculateNutrition()+" litres of "+this.plantInfo.nutrition+" a day");
    }
}
