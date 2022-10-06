package GreenestAgain;

public enum PlantInfo {

    CACTUS("mineralwater", 0.02,"cactus"),
    CARNIVORE("proteindrink", 0.2,"carnivore"),
    PALM("tap water", 0.5,"palm");

    final String nutrition;
    final double value;
    final String type;
    PlantInfo(String a, double b, String c) {
        nutrition = a;
        value = b;
        type = c;
    }
}
