package library.cardholders;

public class CardHolder {

    private String cardholderName;
    private String cardIssueDate;
    private String itemsRented;

    public CardHolder(String cardholderName, String cardIssueDate, String itemsRented) {
        this.cardholderName = cardholderName;
        this.cardIssueDate = cardIssueDate;
        this.itemsRented = itemsRented;
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

    public String getItemsRented() {
        return itemsRented;
    }

    public void setItemsRented(String itemsRented) {
        this.itemsRented = itemsRented;
    }

}
