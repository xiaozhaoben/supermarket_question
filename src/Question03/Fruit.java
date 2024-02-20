package Question03;

public class Fruit {

    protected double unitPrice;

    protected double discount = 1;

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getSumPriceByWeight(int weight) {
        return weight * this.unitPrice * this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
