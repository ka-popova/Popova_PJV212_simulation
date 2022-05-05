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
                item = forestMap.getItem(new Coordinates(pos, y));
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
        forestMap.removeItem(this, new Coordinates(x,y));

        currentX = x;

        for (int pos = x-1; pos >= x-getSpeed(); pos--) {
            Item item;
            try {
                item = forestMap.getItem(new Coordinates(pos, y));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
            if (item != null) {
                break;
            }
            currentX--;
        }
        forestMap.setItem(this, new Coordinates(currentX, y) );
        forestMap.removeItem(this, new Coordinates(x,y));

        int currentY = y;

        for (int pos = y+1; pos <= y+getSpeed(); pos++) {
            Item item;
            try {
                item = forestMap.getItem(new Coordinates(x, pos));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
            if (item != null) {
                break;
            }
            currentY++;
        }
        forestMap.setItem(this, new Coordinates(x, currentY) );
        forestMap.removeItem(this, new Coordinates(x,y));

        currentY = y;

        for (int pos = y-1; pos >= y-getSpeed(); pos--) {
            Item item;
            try {
                item = forestMap.getItem(new Coordinates(x, pos));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
            if (item != null) {
                break;
            }
            currentY--;
        }
        forestMap.setItem(this, new Coordinates(x, currentY) );
        forestMap.removeItem(this, new Coordinates(x,y));

    }
}
