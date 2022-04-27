package popova.simulation.humans;

import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

public class Human implements Item {
    private int speed;
    private int accuracy;
    private int killingItemsCount;
    private Coordinates coordinates;

    protected Human(int speed, int accuracy, int killingItemsCount, Coordinates coordinates) {
        this.speed = speed;
        this.accuracy = accuracy;
        this.killingItemsCount = killingItemsCount;
        this.coordinates = coordinates;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAccuracy() {return accuracy; }

    public int getKillingItemsCount() {
        return killingItemsCount;
    }

    public <T> void kill(T animal){
        return;
    }

    public boolean noMoreKillingItems (){
        return this.killingItemsCount <= 0;
    }

}
