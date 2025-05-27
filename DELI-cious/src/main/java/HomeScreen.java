import java.util.Scanner;

public class HomeScreen {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Sandwich sandwich = new Sandwich(Size.MEDIUM, "white");
        Size size = sandwich.getSize();
        if (size != null) {
            double breadPrice;
            switch (size) { // use switch or if statement
                case SMALL -> breadPrice = 5.50;
                case MEDIUM -> breadPrice = 7;
                case LARGE -> breadPrice = 8.50;

                default -> {
                    System.out.println("Try again bud ");
                    return;
                }

            }
            System.out.println(size + " -" + breadPrice);

            while (true) {

                System.out.println("==Welcome in!=="); //button layout
                System.out.println("1) New Order");
                System.out.println("0) Exit");
                System.out.println("Lets get your order going. Select one for me: ");
                // allows user to put a number
                int choice = myScanner.nextInt();

                if (choice == 1) {
                    System.out.println("Lets get started..");//OrderScreen(myScanner);
                } else if (choice == 0) {
                    System.out.println("Tell your friends about us!");
                    break;
                } else
                    System.out.println("My apologies I didnt understand your input. Try again");
            }
            myScanner.close();

        }

    }



    public static String AddDrink(Scanner myScanner) {
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

}


