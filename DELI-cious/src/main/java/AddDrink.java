import java.util.Scanner;

public class AddDrink {
    //selecting the size and what type of drink they would like
    String drinkName;

    public AddDrink(String drinkName) {
        this.drinkName = drinkName;
    }

    public static String addDrink(Scanner myScanner) {
        System.out.println("\n==Wash it down ==");
        System.out.println("1) Carbonated sugar water");
        System.out.println("2)Warm milk");
        System.out.println("3) Minty orange juice");
        System.out.println("4) room temp Tea");
        System.out.println("5) H20");
        System.out.println("the H20 is faucet water so... choose wisely: ");

        int drinkChoice = myScanner.nextInt();
        myScanner.nextLine();
        String pick = "idk";
        if (drinkChoice == 1)
            pick = "Carbonated sugar water";
        else if (drinkChoice == 2)
            pick = "Warm milk";
        else if (drinkChoice == 3)
            pick = "Minty orange juice";
        else if (drinkChoice == 4)
            pick = "room temp tea";
        else if (drinkChoice == 5)
            pick = "H20";
        return pick;

    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Choice of beverage: " + drinkName;


    }

}


