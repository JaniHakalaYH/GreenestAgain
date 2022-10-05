package GreenestAgain;

public abstract class Plant implements PlantInterface{
    protected String name;
    protected double height;
    protected PlantInfo plantInfo; //Enum
    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }
    public String getName() {
        return name;
    }
}
