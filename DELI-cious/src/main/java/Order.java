import java.util.ArrayList;

public class Order {
    private ArrayList<Drink> drinks = new ArrayList<>();

    public void addDrink(Drink drink) {
        drinks.add(drink);

    }

    public double getPrice() {
        for (Drink d:drinks){
           double price = d.getPrice();
            System.out.println(d.toString() + " price: " + price);
        }
        return 0;
    }


    //allows users to select what they want to add to order :
    // 1)add sandwich 2)add drink 3)add chips 4)checkout 0)cancel order - delete order go back to homepage


}

