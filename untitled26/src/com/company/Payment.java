package com.company;

public class Payment {
    int money;
    String card;
    int cardnum;

    public Payment() {
    }

    public Payment(int money, String card, int cardnum) {
        this.money = money;
        this.card = card;
        this.cardnum = cardnum;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public int getCardnum() {
        return cardnum;
    }

    public void setCardnum(int cardnum) {
        this.cardnum = cardnum;
    }
}
