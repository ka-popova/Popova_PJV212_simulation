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
        // go right
        for (int x = coordinates.getX()+1; x <= coordinates.getX() + getRange(); x++) {
            boolean killSuccess;
            try {
                killSuccess = getItemAndKill(forestMap, x, coordinates.getY());
            }
            catch(ArrayIndexOutOfBoundsException e) {
                return;

            }
            if (killSuccess) {
                return;
            }
        }

        // go left
        for (int x = coordinates.getX()-1; x >= coordinates.getX() - getRange(); x--) {
            boolean killSuccess;
            try {
                killSuccess = getItemAndKill(forestMap, x, coordinates.getY());
            }
            catch(ArrayIndexOutOfBoundsException e) {
                return;

            }
            if (killSuccess) {
                return;
            }
        }
        // go down
        for (int y = coordinates.getY()+1; y <= coordinates.getY() + getRange(); y++) {
            boolean killSuccess;
            try {
                killSuccess = getItemAndKill(forestMap, coordinates.getX(), y);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                return;

            }
            if (killSuccess) {
                return;
            }

        }
        // go up
        for (int y = coordinates.getY()-1; y >= coordinates.getY() - getRange(); y--) {
            boolean killSuccess;
            try {
                killSuccess = getItemAndKill(forestMap, coordinates.getX(), y);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                return;

            }
            if (killSuccess) {
                return;
            }

        }


    }

}
