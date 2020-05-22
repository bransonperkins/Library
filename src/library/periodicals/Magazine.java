package library.periodicals;

import library.libraryitems.Periodical;
import library.enums.SubscriptionPeriods;

public class Magazine extends Periodical {

    private String category;

    public Magazine(String name, int checkoutDurationInDays, boolean stocked, boolean educationalContent,
                    SubscriptionPeriods subscriptionClass, String category) {
        super(name, checkoutDurationInDays, stocked, educationalContent, subscriptionClass);
        setCategory(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}