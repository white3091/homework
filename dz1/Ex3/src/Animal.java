public class Animal {
    String view;
    String colour;
    @Override
    public String toString() {
        return "Animal{" +
                "view='" + view + '\'' +
                ",colour='" + colour + '\'' +
                '}';
    }
    public Animal(String view, String colour) {
        this.view = view;
        this.colour = colour;
    }
}
