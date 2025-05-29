import java.util.ArrayList;

public class Sandwich {
    private Size size;
    private String bread;
    private boolean toasted;
    private String meat;
    private String cheese;
    private String toppings;
    private String sauces;
    private boolean isExtraMeat;
    private boolean isExtraCheese;

    public Sandwich(Size size, String bread) {
        this.size = size;
        this.bread = bread;
    }

    public Sandwich() {

    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public boolean isExtraMeat() {
        return isExtraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        isExtraMeat = extraMeat;
    }
//    public ArrayList<String> meats = new ArrayList<>();
//    public ArrayList<String> cheeses = new ArrayList<>();
//    public ArrayList<String> veggies = new ArrayList<>();
//    public ArrayList<String> sauces = new ArrayList<>();

    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        isExtraCheese = extraCheese;
    }
//
//    private void addMeat(String meat) {
//        meats.add(meat);
//    }
//
//    private void addCheese(String cheese) {
//        cheeses.add(cheese);
//    }
//
//    private void addVeggies(String veggie) {
//        veggies.add(veggie);
//    }
//
//    private void addSauces(String sauce) {
//        sauces.add(sauce);
//    }


    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }


//    public double getMeatPrice() {
//        double pricerPerMeat = 0;
//        switch (size) {
//            case SMALL -> pricerPerMeat = 1.00;
//            case MEDIUM -> pricerPerMeat = 2.00;
//            case LARGE -> pricerPerMeat = 3.00;
//        }
//        return meats.size() + pricerPerMeat;
//    }
//
//    public double getCheesePrice() {
//        double pricePerCheese = 0;
//        switch (size) {
//            case SMALL -> pricePerCheese = .75;
//            case MEDIUM -> pricePerCheese = 1.50;
//            case LARGE -> pricePerCheese = 2.25;
//        }
//        return cheeses.size() + pricePerCheese;
//    }
//
//    public double breadPrice() {
//
//        double priceOfBread = 0;
//        switch (size) { // use switch or if statement
//            case SMALL -> priceOfBread = 5.50;
//            case MEDIUM -> priceOfBread = 7;
//            case LARGE -> priceOfBread = 8.50;
//
//        }
//        return priceOfBread;
//
//
////    }
//
//
//    public double getTotalSandwichPrice() {
//        return getCheesePrice() + getMeatPrice() + breadPrice();
//    }
//
//    @Override
//    public String toString() {
//        return size + " " + bread + "Sandwich with " + meats + ", " + cheeses + ", " + veggies + ", " + sauces;
//
//
//    }

}
