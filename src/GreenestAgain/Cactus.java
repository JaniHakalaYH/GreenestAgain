package GreenestAgain;

import javax.swing.*;

public class Cactus extends Plant { //Arv


    public Cactus(String name, double height) {
        super(name, height);
        this.plantInfo = PlantInfo.CACTUS;
    }

    @Override //från interface och polymorfism
    public double calculateNutrition() {
        return PlantInfo.CACTUS.value;
    }

    @Override
    public void nutritionOutput() {
        JOptionPane.showMessageDialog(null,"Your "+this.plantInfo.type+" "+this.name+" needs "+calculateNutrition()+" litres of "+this.plantInfo.nutrition+" a day");
    }
}
