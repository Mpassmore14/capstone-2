import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    String customerName;
    ArrayList<Drink> drinks;
    ArrayList<Chips> chips;
    ArrayList<Sandwich> sandwiches;

    public Order(String customerName, ArrayList<Drink> drinks, ArrayList<Chips> chips, ArrayList<Sandwich> sandwiches) {
        this.customerName = customerName;
        this.drinks = drinks;
        this.chips = chips;
        this.sandwiches = sandwiches;
    }

    public void printReceipt(){

        System.out.println("Order for :" + customerName);
        double totalPrice = 0;

        for (Drink d : drinks){
            System.out.println( "Drink|Size: "+ d.getSize().toString() +" |Price:$ "+  d.getPrice());
            totalPrice += d.getPrice();


        }
        for (Chips c : chips){
            System.out.println("Chips | " + "price: $" + c.getValue());
            totalPrice += c.getValue();
        }
        for (Sandwich s : sandwiches){
               System.out.printf("Bread: %s | Meat: %s | Cheese: %s | Topping: %s | Sauce: %s | Toasted: %b | Extra meat : %b | Extra Cheese : %b \n",
                    s.getBread(), s.getMeat(), s.getCheese(), s.getToppings(), s.getSauces(),
                    s.isToasted(), s.isExtraMeat(), s.isExtraCheese());
            System.out.println(s.getPrice());
            totalPrice += s.getPrice();
        }
        System.out.println("Total is : " + totalPrice);

    }
    public void saveReceipt(){
        String receiptMessage = "order for: " + customerName + "\n\n";

        double totalPrice = 0;

        for (Drink d : drinks){
          receiptMessage = "Drink|Size: "+ d.getSize().toString() +" |Price:$ "+  d.getPrice() + "\n\n";
            totalPrice += d.getPrice();


        }
        for (Chips c : chips){
            receiptMessage += "Chips | " + "price: $" + c.getValue() + "\n\n";
            totalPrice += c.getValue();
        }
        for (Sandwich s : sandwiches){
            receiptMessage += "Sandwich | Bread: " + s.getBread() + " | Meat: " + s.getMeat()                  + " | Cheese: " + s.getCheese() + " | Toppings: " + s.getToppings() + " | Sauces: " + s.getSauces() +
                    " | Toasted: " + s.isToasted() + " Extra meat: " + s.isExtraMeat()
                    + " Extra cheese: " + s.isExtraCheese() + " | Price: $" + s.getPrice()+ "\n\n";

            totalPrice += s.getPrice();
        }
     receiptMessage +="Total is : " + totalPrice;





        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_hh-mm-ss");
        String fileName = "src/main/Receipts/" + now.format(formatter) + ".txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(receiptMessage);
            writer.close();
            System.out.println(" Receipt saved as: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

