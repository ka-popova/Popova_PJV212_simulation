package popova.simulation.humans;

import popova.simulation.interfaces.Killer;
import popova.simulation.items.Alive;
import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

public abstract class Human extends Alive implements Killer {
    private int accuracy;
    private int killingItemsCount;
//    private Coordinates coordinates;

    protected Human(int speed, int accuracy, int killingItemsCount/*, Coordinates coordinates*/) {
        super(speed, 1);
        this.accuracy = accuracy;
        this.killingItemsCount = killingItemsCount;
//        this.coordinates = coordinates;
    }


    public int getAccuracy() {return accuracy; }

    public int getKillingItemsCount() {
        return killingItemsCount;
    }

    @Override
    public boolean kill(Item item) {
        item.setHealthToZero();
        return true;
    }

    public abstract int getRange();

    public boolean noMoreKillingItems (){
        return this.killingItemsCount <= 0;
    }

}
