public class Laptop {
    String colour;
    String model;

    @Override
    public String toString() {
        return "Laptop{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Laptop(String colour, String model) {
        this.colour = colour;
        this.model = model;
    }
}
