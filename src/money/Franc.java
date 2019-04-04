package money;

import java.util.Objects;

public class Franc extends Money{

    Franc(int amount, String currency){
        super(amount, currency);
    }

    public Money times(int multiplier)  {
        return Money.franc(amount * multiplier);
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
