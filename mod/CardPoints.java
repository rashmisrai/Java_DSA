package com.mod;

public class CardPoints {

    private int cardId;
    private String holderName;
    private int balancePoints;

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setBalancePoints(int balancePoints) {
        this.balancePoints = balancePoints;
    }

    public int getBalancePoints() {
        return balancePoints;
    }

    public boolean withdrawPoints(int points) {
        if (balancePoints < points) {
            System.out.println("Sorry!!! No enough points");
            return false;
        } else {
            int rem = balancePoints - points;
            balancePoints = rem;
            System.out.printf("Balance points after used:%d\n", rem);
            return true;
        }
    }
}







