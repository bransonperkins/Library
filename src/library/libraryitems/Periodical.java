package library.libraryitems;

public class Periodical extends LibraryItem {

    private SubscriptionPeriods subscriptionClass;

    public Periodical(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked,
                      SubscriptionPeriods subscriptionClass) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked);
        setSubscriptionClass(subscriptionClass);
    }

    public SubscriptionPeriods getSubscriptionClass() {
        return subscriptionClass;
    }

    public void setSubscriptionClass(SubscriptionPeriods subscriptionClass) {
        this.subscriptionClass = subscriptionClass;
    }
}
