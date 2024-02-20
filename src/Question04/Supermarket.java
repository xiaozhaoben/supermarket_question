package Question04;

public class Supermarket {

    private double sumPrice;
    private final Fruit apple;
    private final Fruit strawberry;
    private final Fruit mango;

    public Supermarket(double sumPrice) {
        this.sumPrice = sumPrice;
        this.apple = new Apple();
        this.apple.setUnitPrice(8);
        this.strawberry = new Strawberry();
        this.strawberry.setUnitPrice(13);
        this.mango = new Strawberry();
        this.mango.setUnitPrice(20);
    }

    public void promotion() {
        this.strawberry.setDiscount(0.8);
    }

    public Fruit getMango() {
        return mango;
    }

    public Fruit getApple() {
        return apple;
    }

    public Fruit getStrawberry() {
        return strawberry;
    }

    public void CalculateSumPrice(Fruit fruit, int weight) {
        this.sumPrice += fruit.getSumPriceByWeight(weight);
    }

    public double getSumPrice() {
        return this.sumPrice;
    }

    public double promotionGetSumPrice() {
        double sumPrice = getSumPrice();
        if (sumPrice >= 100) {
            return sumPrice - 10;
        }
        return sumPrice;
    }

}
