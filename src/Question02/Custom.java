package Question02;

public class Custom {

    public static void buyGoods() {
        Supermarket supermarket = new Supermarket(0);
        int appleWeight = (int) (Math.random() * 10);
        int strawberryWeight = (int) (Math.random() * 10);
        int mangoWeight = (int) (Math.random() * 10);
        supermarket.CalculateSumPrice(supermarket.getApple(), appleWeight);
        supermarket.CalculateSumPrice(supermarket.getStrawberry(), strawberryWeight);
        supermarket.CalculateSumPrice(supermarket.getMango(), mangoWeight);
        double sumPrice = supermarket.getSumPrice();
        String output = String.format("购买总价格为: %.2f 苹果重量: %d斤, 草莓重量: %d斤, 芒果重量: %d斤", sumPrice, appleWeight, strawberryWeight, mangoWeight);
        System.out.println(output);
        System.out.println("验证价格: " + (8 * appleWeight + 13 * strawberryWeight + 20 * mangoWeight));
    }

    public static void main(String[] args) {
        buyGoods();
    }

}
