import java.util.ArrayList;
import java.util.Collections;

public class OrderScreen {
    //allows users to select what they want to add to order :
    // 1)add sandwich 2)add drink 3)add chips 4)checkout 0)cancel order - delete order go back to homepage

    private ArrayList<String> selections;
    public OrderScreen(){
        selections = new ArrayList<>();
        String[] toppings = {"Lettuce","Tomato","Onion","Jalepeno","Peppers","Pickles","Guac","Mushrooms"};
        String[] sauces = {"Mayo","Mustard","Ranch","Ketchup","Thousand Islands","Vinaigrette"};
        for (String topping : toppings){
            for (String sauce :sauces){

            }
        }

    }

}
