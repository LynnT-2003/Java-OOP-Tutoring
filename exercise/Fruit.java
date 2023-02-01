package exercise;

public class Fruit implements Edible {

    // data member
    private String name;

    // constructors
    public Fruit(String name) {
        this.name = name;
    }

    // methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name);
    }
}
