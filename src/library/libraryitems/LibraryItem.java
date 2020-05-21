package library.libraryitems;

public class LibraryItem {

    // add release date for each item??
    private String name;
    private int id;
    private int checkoutDurationInDays;
    private double checkoutFee;
    private boolean stocked;

    public LibraryItem(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked) {
        setName(name);
        setId(id);
        setCheckoutDurationInDays(checkoutDurationInDays);
        setCheckoutFee(checkoutFee);
        setStocked(stocked);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCheckoutDurationInDays() {
        return checkoutDurationInDays;
    }

    public void setCheckoutDurationInDays(int checkoutDurationInDays) {
        this.checkoutDurationInDays = checkoutDurationInDays;
    }

    public double getCheckoutFee() {
        return checkoutFee;
    }

    public void setCheckoutFee(double checkoutFee) {
        this.checkoutFee = checkoutFee;
    }

    public boolean isStocked() {
        return stocked;
    }

    public void setStocked(boolean stocked) {
        this.stocked = stocked;
    }

    public void isItemInStock() {
        System.out.println(stocked ? "Yes! We have " + this.getName() + " in stock!" : "No! We don't have " + this.getName() +
                " in stock!");
    }

    @Override
    public String toString() {
        return "You are checking out " + this.getName() + " for a period of " + this.getCheckoutDurationInDays() +
                " days." + "The late fee is $" + this.getCheckoutFee() + " if you don't return it within " +
                this.getCheckoutDurationInDays() + " days.";
    }

}