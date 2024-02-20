package Question01;

public class Custom {

    public static void buyGoods() {
        int appleWeight = (int) (Math.random() * 10);
        int strawberryWeight = (int) (Math.random() * 10);
        Supermarket supermarket = new Supermarket(0);
        supermarket.CalculateSumPrice(supermarket.getApple(), appleWeight);
        supermarket.CalculateSumPrice(supermarket.getStrawberry(), strawberryWeight);
        System.out.println("购买总价格为: " + supermarket.getSumPrice());
        System.out.println("验证价格: " + (8 * appleWeight + 13 * strawberryWeight));
    }

    public static void main(String[] args) {
        buyGoods();
    }

}
