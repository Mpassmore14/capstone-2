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
    private boolean hasMeat;
    private boolean hasCheese;

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

    public boolean isHasMeat() {
        return this.meat != null;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public boolean isHasCheese() {
        return this.cheese != null;
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


    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        isExtraCheese = extraCheese;
    }


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

    public double getPrice() {
        double price = 0;
        switch (this.size) {
            case SMALL -> {
                price = 5.50;
                if (this.isHasMeat()) {
                    price += 1.00;
                }
                if (this.isHasCheese()) {
                    price += .75;
                }
                if (this.isExtraMeat) {
                    price += .50;
                }
                if (this.isExtraCheese) {
                    price += .30;
                }
            }
            case MEDIUM -> {
                price = 7.00;
                if (this.isHasMeat()) {
                    price += 2.00;
                }
                if (this.isHasCheese()) {
                    price += 1.50;
                }
                if (this.isExtraMeat) {
                    price += 1.00;
                }
                if (this.isExtraCheese) {
                    price += .60;
                }
            }
            case LARGE -> {
                price = 8.50;
                if (this.isHasMeat()) {
                    price += 3.00;
                }
                if (this.isHasCheese()) {
                    price += 2.25;
                }
                if (this.isExtraMeat) {
                    price += 1.50;
                }
                if (this.isExtraCheese) {
                    price += .90;
                }

            }
        } return price;
    }


}
