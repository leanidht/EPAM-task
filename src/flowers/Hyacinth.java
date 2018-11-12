package flowers;

import com.company.FlwDescription;

public class Hyacinth implements FlwDescription {

    private int price;

    public Hyacinth (int price){
        this.price = price;
    }

    @Override
    public String getName() {
        return "hyacinth";
    }

    @Override
    public int getPrice() {
        return price;
    }




}