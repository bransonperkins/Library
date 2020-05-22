package library.interfaces;

import library.enums.LateFee;

public interface Loanable {
    void isLoanable();
    void lateFee(LateFee feeCost);
}