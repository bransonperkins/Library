package library.periodicals;

import library.libraryitems.Periodical;
import library.enums.SubscriptionPeriods;

public class Magazine extends Periodical {

    private String category;

    public Magazine(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked,
                    SubscriptionPeriods subscriptionClass, String category) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked, subscriptionClass);
        setCategory(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}