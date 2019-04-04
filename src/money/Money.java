package money;

class Money {
    protected int amount;
    protected String currency;

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    String currency() {
        return currency;
    }

    Money(int amount,String currency){
        this.amount = amount;
        this.currency = currency;
    }
    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

}
