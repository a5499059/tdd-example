package money;

import java.util.Objects;

public class Dollar extends Money{

    Dollar(int amount){

        this.amount = amount;

    }

    public Dollar times(int multiplier)  {
        return new Dollar(amount * multiplier);
    }


    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
