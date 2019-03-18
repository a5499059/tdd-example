package money;

import java.util.Objects;

public class Dollar {
    public int amount;

    Dollar(int amount){

        this.amount = amount;

    }

    public Dollar times(int multiplier)  {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
