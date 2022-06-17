package com.company;

public class LimitException extends Exception{
    String message;
    double remainingAmount;

    public LimitException(String message, double remainingAccount) {
        this.message = message;
        this.remainingAmount = remainingAccount;
    }

    public LimitException(String message) {
        super(message);
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

}

