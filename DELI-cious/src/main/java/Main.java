public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Drink drink = new Drink("Diet Coke",Size.LARGE);
        order.addDrink(drink);
        drink = new Drink("Coke",Size.MEDIUM);
        order.addDrink(drink);
        Sandwich sandwich = new Sandwich();
        order.addSandwich(sandwich);


        double price = drink.getPrice();
        System.out.println("Second drink price: " + price);


        price = order.getPrice();
        System.out.println("total order price:" + price);


    }
}
