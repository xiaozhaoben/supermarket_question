package Question01;

public class Supermarket {

    private double sumPrice;
    private final Fruit apple;
    private final Fruit strawberry;

    public Supermarket(double sumPrice) {
        this.sumPrice = sumPrice;
        this.apple = new Apple();
        this.apple.setUnitPrice(8);
        this.strawberry = new Strawberry();
        this.strawberry.setUnitPrice(13);
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

}
