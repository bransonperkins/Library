package library.libraryitems;

import library.enums.SubscriptionPeriods;

public class Periodical extends LibraryItem {

    private SubscriptionPeriods subscriptionClass;

    public Periodical(String name, int checkoutDurationInDays, boolean stocked,
                      boolean educationalContent, SubscriptionPeriods subscriptionClass) {
        super(name, checkoutDurationInDays, stocked, educationalContent);
        setSubscriptionClass(subscriptionClass);
    }

    public SubscriptionPeriods getSubscriptionClass() {
        return subscriptionClass;
    }

    public void setSubscriptionClass(SubscriptionPeriods subscriptionClass) {
        this.subscriptionClass = subscriptionClass;
    }

    public void subscriptionInfo() {
        System.out.printf("You are more than welcome to rent %s from our library, but we do offer subscriptions. %s "
                + "renews on a %s basis.%n", this.getName(), this.getName(), this.getSubscriptionClass());
    }
}
