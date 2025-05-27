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

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Choice of beverage: " + drinkName +" -"+ size;


    }

}


