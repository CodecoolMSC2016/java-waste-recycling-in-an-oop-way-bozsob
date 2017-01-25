public class Garbage {
    String name;
    public Garbage(String name) {
        System.out.println("A new garbage: " + name);
    }

    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
}