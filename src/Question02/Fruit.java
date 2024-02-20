package Question02;

public abstract class Fruit {

    protected double unitPrice;
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getSumPriceByWeight(int weight) {
        return weight * this.unitPrice;
    }
}
