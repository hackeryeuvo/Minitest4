package Minitest4;

public class Drinks extends Product {
    private int volume;
    private String bottleType;

    public Drinks(int id, String name, int price, int quantity, Category category, int volume, String bottleType) {
        super(id, name, price, quantity, category);
        this.volume = volume;
        this.bottleType = bottleType;
    }
    public Drinks(int id, String name, int price, int quantity, int volume, String bottleType) {
        super(id, name, price, quantity);
        this.volume = volume;
        this.bottleType = bottleType;
    }

    public Drinks(int volume, String bottleType) {
        this.volume = volume;
        this.bottleType = bottleType;
    }
    public Drinks(){

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBottleType() {
        return bottleType;
    }

    public void setBottleType(String bottleType) {
        this.bottleType = bottleType;
    }

    @Override
    public String toString() {
        return "Drinks{" + super.toString() +'\''+
                "volume=" + volume +
                ", bottleType='" + bottleType + '\'' +
                '}';
    }
}
