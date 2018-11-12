package flowers;

import com.company.FlwDescription;

public class Aster implements FlwDescription {

    private int price;

    public Aster (int price ){
        this.price = price;
    }

    @Override
    public String getName() {
        return "aster";
    }

    @Override
    public int getPrice() {
        return price;
    }

}
