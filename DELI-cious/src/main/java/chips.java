public class chips {
    //select type of chips
    String chips;

    public chips(String chips) {
        this.chips = chips;
    }

    public String getChips() {
        return chips;
    }

    @Override
    public String toString() {
        return "And some  " + chips + " to go with it .";
    }

}
