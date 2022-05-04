package popova.simulation.interfaces;

import popova.simulation.gui.ForestMap;
import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

public abstract class Moveable extends Item {
    public abstract int getSpeed();

    public Moveable(int healthLevel) {
        super(healthLevel);
    };

    public void move(ForestMap forestMap, int x, int y) {
        int currentX = x;
        for (int pos = x+1; pos <= x+getSpeed(); pos++) {
            Item item;
            try {
                item = forestMap.getItem(new Coordinates(x, y));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
            if (item != null) {
                break;
            }
            currentX++;
        }
        forestMap.setItem(this, new Coordinates(currentX, y) );

    }
}
