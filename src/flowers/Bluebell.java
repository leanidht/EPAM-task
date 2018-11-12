package flowers;

import com.company.FlwDescription;

public class Bluebell implements FlwDescription {

    private int price;

    public Bluebell (int price){
        this.price = price;
    }

    @Override
    public String getName() {
        return "bluebell";
    }

    @Override
    public int getPrice() {
        return price;
    }




}