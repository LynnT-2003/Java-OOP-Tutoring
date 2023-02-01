package exercise;

public class Cat extends Animal implements compareTo{
    public Cat(int weight) {
        super(weight);
    }

    @Override
    public double compareWeight(Animal other) {
        return this.getWeight() - other.getWeight();
    }
}
