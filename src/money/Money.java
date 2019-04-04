package money;

abstract class Money {
    protected int amount;
    protected String currency;
    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
    String currency() {
        return currency;
    }

    Money(int amount,String currency){
        this.amount = amount;
        this.currency = currency;
    }

}
