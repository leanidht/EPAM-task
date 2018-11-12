package flowers;

import com.company.FlwDescription;

public class Gerbera implements FlwDescription {

    private int price;

    public Gerbera (int price){
        this.price = price;
    }

    @Override
    public String getName() {
        return "gerbera";
    }

    @Override
    public int getPrice() {
        return price;
    }



}