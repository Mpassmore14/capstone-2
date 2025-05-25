public class AddChips {
    public AddChips(String chips) {
        this.chips = chips;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    //select type of chips
    String chips;
    @Override
    public String toString() {
        return "And some  " + chips + " to go with it .";
    }

}
