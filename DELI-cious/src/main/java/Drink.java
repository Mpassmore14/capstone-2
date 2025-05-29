import java.util.Scanner;

public class Drink {
    private String drinkName;
    private Size size;

    public Drink(String drinkName, Size size) {
        this.drinkName = drinkName;
        this.size = size;
    }

    public String getDrinkName() {
        return drinkName;
    }


    public Size getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Choice of beverage: " + drinkName + " -" + size;


    }

    public double getPrice() {
            for (Drink d: ){
                double price = d.getPrice();
                System.out.println(d.toString() + " price: " + price);
            }
        return 0;

    }



}


