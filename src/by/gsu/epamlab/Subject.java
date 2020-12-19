package by.gsu.epamlab;

public class Subject {
    private String name;
    private String material;
    private double volume;
    private Material material;

    public Subject() {

    }

    public Subject(String name, String material, String volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public double getMass(double density, double volume){
        return density * volume;
    }

    @Override
    public String toString() {
        return name + ";"
                + material + ";"
                + volume + ";"
                + getMass() + "\n";
    }
}
