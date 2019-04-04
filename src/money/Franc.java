package money;

import java.util.Objects;

public class Franc extends Money{

    Franc(int amount){

        this.amount = amount;

    }

    public Franc times(int multiplier)  {
        return new Franc(amount * multiplier);
    }


    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}