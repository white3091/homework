public class Main {
    static Object[] newObjects = {
            new House("Lenina", 26),
            null,
            new Laptop("white", "DELL"),
            new Animal("cat", "black")};

    public static void main(String[] args) {
        for (int i = 0; i < newObjects.length; i++) {
            System.out.println(newObjects[i]);
        }
    }
}