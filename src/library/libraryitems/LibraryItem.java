package library.libraryitems;

import library.enums.LateFee;
import library.interfaces.Loanable;
import library.interfaces.Reservable;

public class LibraryItem implements Reservable, Loanable {

    // Library Item fields
    // create counter to generate new ID each time new LibraryItem is created
    private static int counter = 113355790;
    public final int id;
    private String name;
    private int checkoutDurationInDays;
    private double checkoutFee = 1.99;
    private boolean stocked;
    private boolean educationalContent;

    public LibraryItem(String name, int checkoutDurationInDays, boolean stocked,
                       boolean educationalContent) {
        this.id = counter++;
        setName(name);
        setCheckoutDurationInDays(checkoutDurationInDays);
        setStocked(stocked);
        setEducationalContent(educationalContent);
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

    public int getCheckoutDurationInDays() {
        return checkoutDurationInDays;
    }

    public void setCheckoutDurationInDays(Integer checkoutDurationInDays) {
        this.checkoutDurationInDays = checkoutDurationInDays;
    }

    public double getCheckoutFee() {
        return checkoutFee;
    }

    public void setCheckoutFee(Double checkoutFee) {
        this.checkoutFee = checkoutFee;
    }

    public boolean isStocked() {
        return stocked;
    }

    public void setStocked(boolean stocked) {
        this.stocked = stocked;
    }

    public boolean isEducationalContent() {
        return educationalContent;
    }

    public void setEducationalContent(boolean educationalContent) {
        this.educationalContent = educationalContent;
    }

    public void isItemInStock() {
        System.out.println(stocked ? "Yes! We have " + this.getName() + " in stock!" : "No! We don't have " +
                this.getName() + " in stock!");
    }

    @Override
    public String toString() {
        return "You are checking out " + this.getName() + " for a period of " + this.getCheckoutDurationInDays() +
                " days." + "The late fee is $" + this.getCheckoutFee() + " if you don't return it within " +
                this.getCheckoutDurationInDays() + " days.";
    }

    @Override
    public void isReservable() {
        System.out.println(educationalContent ? this.getName() + " can be reserved. However, these items can only be used on the " +
                "premises due to high demand." : this.getName() + " cannot be reserved. First come, first served!");
    }

    @Override
    public void isLoanable() {
        if (!educationalContent) System.out.println(this.getName() + " is available for loan!");
        else System.out.println(this.getName() +
                " is not available for loan.");
    }

    @Override
    public void lateFee(LateFee feeCost) {
        switch (feeCost) {
            case DAILY -> System.out.println("$1");
            case WEEKLY -> System.out.println("$3");
            case BIMONTHLY -> System.out.println("$5");
            case MONTHLY -> System.out.println("$10");
            default -> System.out.println("No late fees.");
        }
    }
}