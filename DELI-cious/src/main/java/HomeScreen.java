import java.util.ArrayList;
import java.util.Scanner;

public class HomeScreen {
    static Scanner myScanner = new Scanner(System.in);
    static ArrayList<Sandwich> sandwichOrder = new ArrayList<>();
    static ArrayList<Drink> drinkOrder = new ArrayList<>();
    static ArrayList<Chips> chipOrder = new ArrayList<>();


    public static void main(String[] args) {
                        System.out.println("==Welcome in!=="); //button layout
                System.out.println("1) New Order");
                System.out.println("0) Exit");
                System.out.println("Lets get your order going. Select one for me: ");
                // allows user to put a number
                int choice = myScanner.nextInt();
                myScanner.nextLine();

                if (choice == 1) {
                    System.out.println("Lets get started..");
                    orderScreen();

                } else if (choice == 0) {
                    System.out.println("Tell your friends about us!");
                } else
                    System.out.println("My apologies I didnt understand your input. Try again");



        }








    public static void orderScreen(){
        addChips();
        addDrink();
        addSandwich();
        checkout();


    }
    public static void checkout(){

        System.out.println("let me get a name");
        String customerName = myScanner.nextLine();
        Order order = new Order(customerName,drinkOrder,chipOrder,sandwichOrder);
        order.printReceipt();
        order.saveReceipt();
    }

    public static void addSandwich() {
        Sandwich sandwich = new Sandwich();
        System.out.println("Would you like a sandwich? (Y/N");

        String sandwichChoice = myScanner.nextLine();
        if (sandwichChoice.equalsIgnoreCase("y")) {
            System.out.println("1)Small, 2) Medium, 3)Large");
            System.out.println("What size would you like?");
            String sandwichSize = myScanner.nextLine();
            if (sandwichSize.equals("1")) {
                sandwich.setSize(Size.SMALL);
            } else if (sandwichSize.equals("2")) {
                sandwich.setSize(Size.MEDIUM);
            } else if (sandwichSize.equals("3")) {
                sandwich.setSize(Size.LARGE);
            }
            System.out.println("1)White, 2)Wheat, 3)Rye, 4)Wrap ");
            System.out.println("What type of bread would you like?");
            String breadChoice = myScanner.nextLine();
            if (breadChoice.equals("1")) {
                sandwich.setBread("White");
            } else if (breadChoice.equals("2")) {
                sandwich.setBread("Wheat");
            } else if (breadChoice.equals("3")) {
                sandwich.setBread("Rye");
            } else if (breadChoice.equals("4")) {
                sandwich.setBread("Wrap");
            }
            System.out.println("Toasted? Y/N");
            String isToasted = myScanner.nextLine();
            if (isToasted.equalsIgnoreCase("y"))
                System.out.println("Toasty");

            System.out.println("1)Steak, 2)Ham, 3)Salami, 4)Roast Beef, 5)Chicken, 6)Bacon");
            System.out.println("What type of meat would you like?");
            String meatChoice = myScanner.nextLine();
            if (meatChoice.equals("1")) {
                sandwich.setMeat("Steak");
            } else if (meatChoice.equals("2")) {
                sandwich.setMeat("Ham");
            } else if (meatChoice.equals("3")) {
                sandwich.setMeat("Salami");
            } else if (meatChoice.equals("4")) {
                sandwich.setMeat("Roast Beef");
            } else if (meatChoice.equals("5")) {
                sandwich.setMeat("Chicken");
            } else if (meatChoice.equals("6")) {
                sandwich.setMeat("Bacon");
            }
            System.out.println("Would you like extra meat? Y/N");
            String extraMeat = myScanner.nextLine();
            if (extraMeat.equalsIgnoreCase("Y")) {
                sandwich.setExtraMeat(true);
            }

            System.out.println("How bout some cheese? Y/N");
            String cheeseChoice = myScanner.nextLine();
            if (cheeseChoice.equalsIgnoreCase("y")) {
                System.out.println("1)American, 2)Provolone, 3)Cheddar, 4)Swiss");
                System.out.println("What kind of cheese would you like ?");
                String cheeseType = myScanner.nextLine();
                if (cheeseType.equals("1")) {
                    sandwich.setCheese("American");
                } else if (cheeseType.equals("2")) {
                    sandwich.setCheese("Provolone");
                } else if (cheeseType.equals("3")) {
                    sandwich.setCheese("Cheddar");
                } else if (cheeseType.equals("4")) {
                    sandwich.setCheese("Swiss");
                }
            }
            System.out.println("Would you like extra cheese? Y/N");
            String extraCheese = myScanner.nextLine();
            if (extraCheese.equalsIgnoreCase("Y")) {
                sandwich.setExtraCheese(true);
            }
            System.out.println("1)Lettuce, 2)Peppers, 3) Onions, 4) Tomatoes, 5)Jalapenos, 6)Cucumbers, 7)Pickles, 8)Guac, 9)Mushrooms");
            System.out.println("What toppings would you like? ");
            String toppingType = myScanner.nextLine();
            if (toppingType.equals("1")) {
                sandwich.setToppings("Lettuce");
            } else if (toppingType.equals("2")) {
                sandwich.setToppings("Peppers");
            } else if (toppingType.equals("3")) {
                sandwich.setToppings("Onions");
            } else if (toppingType.equals("4")) {
                sandwich.setToppings("Tomatoes");
            } else if (toppingType.equals("5")) {
                sandwich.setToppings("Jalapenos");
            } else if (toppingType.equals("6")) {
                sandwich.setToppings("Cucumbers");
            } else if (toppingType.equals("7")) {
                sandwich.setToppings("Pickles");
            } else if (toppingType.equals("8")) {
                sandwich.setToppings("Guac");
            } else if (toppingType.equals("9")) {
                sandwich.setToppings("Mushrooms");
            }
            System.out.println("Gettin' SAUCY with it? Y/n");
            String sauceChoice = myScanner.nextLine();
            if (sauceChoice.equalsIgnoreCase("y")) {
                System.out.println("1)Mayo, 2)Mustard, 3)Ketchup, 4)Ranch, 5)Thousand Island, 6)Vinaigrette");
                System.out.println("What kind of sauce?");
                String sauceType = myScanner.nextLine();
                if (sauceType.equals("1")) {
                    sandwich.setSauces("Mayo");
                } else if (sauceType.equals("2")) {
                    sandwich.setSauces("Mustard");
                } else if (sauceType.equals("3")) {
                    sandwich.setSauces("Ketchup");
                } else if (sauceType.equals("4")) {
                    sandwich.setSauces("Thousand Island");
                } else if (sauceType.equals("5")) {
                    sandwich.setSauces("Vinaigrette");
                }

            }

        }


        // Stay inside this bracket
        sandwichOrder.add(sandwich);
        System.out.printf("Bread: %s | Meat: %s | Cheese: %s | Topping: %s | Sauce: %s | Toasted: %b | Extra meat : %b | Extra Cheese : %b \n",
                sandwich.getBread(), sandwich.getMeat(), sandwich.getCheese(), sandwich.getToppings(), sandwich.getSauces(),
                sandwich.isToasted(), sandwich.isExtraMeat(), sandwich.isExtraCheese());
        System.out.println(sandwich.getPrice());
    }

    public static void addDrink() {
        Drink drink = new Drink();
        System.out.println("Would you like a Drink? (Y/N)");

        String drinkChoice = myScanner.nextLine().trim();
        if (drinkChoice.equalsIgnoreCase("y")) {
            System.out.println("1) Small, 2) Medium, 3)Large");
            System.out.println("What size would you like? ");
            String sizeChoice = myScanner.nextLine().trim();
            if (sizeChoice.equals("1")) {
                drink.setSize(Size.SMALL);
            } else if (sizeChoice.equals("2")) {
                drink.setSize(Size.MEDIUM);
            } else if (sizeChoice.equals("3")) {
                drink.setSize(Size.LARGE);
            }
            System.out.println("1) Carbonated sugar water, 2) Warm Milk, 3) Minty OJ, 4) Room Temp Tea, 5) H20");
            System.out.println("The H20 is faucet water ... so choose wisely: ");
            String drinkType = myScanner.nextLine().trim();
            if (drinkType.equals("1"))
                drink.setDrinkName("Carbonated sugar water");
            else if (drinkType.equals("2")) {
                drink.setDrinkName("Warm Milk");
            } else if (drinkType.equals("3")) {
                drink.setDrinkName("Minty OJ");
            } else if (drinkType.equals("4")) {
                drink.setDrinkName("Room Temp Tea");
            } else if (drinkType.equals("5")) {
                drink.setDrinkName("H20");

            }
            drinkOrder.add(drink);
        }
        System.out.println(drink.getPrice());


    }

    public static void addChips() {
        Chips chips = new Chips();
        System.out.println("Chips to go with it? (Y/N)");
        String chipChoice =myScanner.nextLine().trim();

        if (chipChoice.equalsIgnoreCase("Y")) {
            chipOrder.add(chips);

        }
        System.out.println(chips.getValue());


    }

}



