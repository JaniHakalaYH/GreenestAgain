package GreenestAgain;

public enum PlantInfo {

    CACTUS("mineralwater", 0.02,"cactus"),
    CARNIVORE("proteindrink", 0.2,"carnivore"),
    PALM("tap water", 0.5,"palm");

    public final String nutrition;
    public final double value;
    public final String type;
    PlantInfo(String a, double b, String c) {
        nutrition = a;
        value = b;
        type = c;
    }
}
