package Minitest4;

public class Candy extends Product {
    private int weight;

    public Candy(int id, String name, int price, int quantity, Category category, int weight) {
        super(id, name, price, quantity, category);
        this.weight = weight;
    }

    public Candy(int weight) {
        this.weight = weight;
    }
    public Candy(){

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "Candy{" +super.toString()+'\'' +
                "weight='" + weight + '\'' +
                '}';
    }
}
