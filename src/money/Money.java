package money;

class Money {
    protected int amount;
    @Override
    public boolean equals(Object o) {
        Money Money = (Money) o;
        return amount == Money.amount;
    }
}
