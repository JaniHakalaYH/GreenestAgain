package GreenestAgain;

import javax.swing.*;

public class Palm extends Plant { //Arv


    public Palm(String name, double height) {
        super(name, height);
        this.plantInfo = PlantInfo.PALM;

    }

    @Override //från interface och polymorfism
    public double calculateNutrition() {
        return PlantInfo.PALM.value*this.height;
    }
    @Override
    public void nutritionOutput() {
        JOptionPane.showMessageDialog(null,"Your "+this.plantInfo.type+" "+this.name+" needs "+calculateNutrition()+" litres of "+this.plantInfo.nutrition+" a day");
    }
}
