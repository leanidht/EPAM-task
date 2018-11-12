package flowers;

import com.company.FlwDescription;

public class Chamomile implements FlwDescription {

    private int price;

    public Chamomile (int price){
        this.price = price;
    }

    @Override
    public String getName() {
        return "chamomile";
    }

    @Override
    public int getPrice() {
        return price;
    }




}
