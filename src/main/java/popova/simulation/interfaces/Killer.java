package popova.simulation.interfaces;

import popova.simulation.items.Item;

public interface Killer {
    void kill(Item item);

    int getRange();

}
