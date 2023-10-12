package controller;


public class Money {
    float money;
    float exchange_Rate;

    public Money() {
    }

    public Money(float money, float exchange_Rate) {
        this.money = money;
        this.exchange_Rate = exchange_Rate;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public float getExchange_Rate() {
        return exchange_Rate;
    }

    public void setExchange_Rate(float exchange_Rate) {
        this.exchange_Rate = exchange_Rate;
    }
}