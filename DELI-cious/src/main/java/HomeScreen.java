import java.util.Scanner;

public class HomeScreen {
//    This screen gives user following options :
    //1) New order , 0) Exit

    static int choice;
    Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {


        AddSandwich AddSandwich = new AddSandwich();
        double price = 0;
        switch (AddSandwich.getSize()) {
            case "Small" -> price = 5.50;
            case "Medium" -> price = 7;
            case "Large" -> price = 8.50;
            default -> {
                throw new RuntimeException("huh?");
            }
            while (true) {

                System.out.println("==Welcome in!=="); //button layout
                System.out.println("1) New Order");
                System.out.println("0) Exit");
                System.out.println("Lets get your order going. Select one for me: ");
                // allows user to put a number

                //           if (choice ==1) //OrderScreen(myScanner);
                //            else if (choice ==0) System.out.println("Tell your friends about us!");
                //            else System.out.println("My apologies I didnt understand your input. Try again");
                myScanner.close();

            }
        }

        }

    }



