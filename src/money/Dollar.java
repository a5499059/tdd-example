package money;

import java.util.Objects;

public class Dollar extends Money{

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier)  {
        return Money.dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }


    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
