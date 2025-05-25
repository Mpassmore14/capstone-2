import java.util.Scanner;
import java.util.ArrayList;

public class HomeScreen {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        AddSandwich addSandwich = new AddSandwich();
        String size = addSandwich.getSize();
        if (size != null) {
            double price;
            switch (size) { // use switch or if statement
                case "Small" -> price = 5.50;
                case "Medium" -> price = 7;
                case "Large" -> price = 8.50;

                default -> {
                    System.out.println("Try again bud ");
                    return;
                }

            }
            System.out.println(size + price);

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
}


