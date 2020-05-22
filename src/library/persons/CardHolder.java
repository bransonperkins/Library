package library.persons;

public class CardHolder {

    private String cardholderName;
    private String cardIssueDate;
    public String cardHolderAge;
    private String itemsRented;

    public CardHolder(String cardholderName, String cardIssueDate, String cardHolderAge, String itemsRented) {
        setCardholderName(cardholderName);
        setCardIssueDate(cardIssueDate);
        setCardHolderAge(cardHolderAge);
        setItemsRented(itemsRented);
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardIssueDate() {
        return cardIssueDate;
    }

    public void setCardIssueDate(String cardIssueDate) {
        this.cardIssueDate = cardIssueDate;
    }

    public String getCardHolderAge() {
        return cardHolderAge;
    }

    public void setCardHolderAge(String cardHolderAge) {
        this.cardHolderAge = cardHolderAge;
    }

    public String getItemsRented() {
        return itemsRented;
    }

    public void setItemsRented(String itemsRented) {
        this.itemsRented = itemsRented;
    }

}