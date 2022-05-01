package popova.simulation.interfaces;

import popova.simulation.gui.ForestMap;
import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

public interface Killer {
    boolean kill(Item item);

    int getRange();

    private boolean getItemAndKill(ForestMap forestMap, int x, int y){

        Item item = forestMap.getItem(new Coordinates(x, y));
        if (item != null) {
            return (kill(item));
        }
        return false;
    }

    default void tryToKill(ForestMap forestMap, Coordinates coordinates) {
        Item item;
        // go right
        for (int x = coordinates.getX()+1; x <= coordinates.getX() + getRange(); x++) {
            boolean killSuccess;
            try {
                killSuccess = getItemAndKill(forestMap, x, coordinates.getY());
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Конец карты");
                return;

            }
            if (killSuccess) {
                return;
            }
        }

        // go left
        for (int x = coordinates.getX()-1; x >= coordinates.getX() - getRange(); x--) {
            item = forestMap.getItem(new Coordinates(x, coordinates.getY()));
            if (item != null) {
                if (kill(item)) {
                    return;
                }
            }

        }
        // go down
        for (int y = coordinates.getY()+1; y <= coordinates.getY() + getRange(); y++) {
            item = forestMap.getItem(new Coordinates(coordinates.getX(), y));
            if (item != null) {
                if (kill(item)) {
                    return;
                }
            }

        }
        // go up
        for (int y = coordinates.getY()-1; y >= coordinates.getY() - getRange(); y--) {
            item = forestMap.getItem(new Coordinates(coordinates.getX(), y));
            if (item != null) {
                if (kill(item)) {
                    return;
                }
            }

        }


    }

}
