package popova.simulation.gui;

import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;

public class ForestMap {
    private Item[][] map;

    public ForestMap() {
        this.map = new Item[MAX_Y][MAX_X];
    }

    public Item getItem(Coordinates coordinates) {
        return map[coordinates.getY()][coordinates.getX()];
    }

    public void removeItem(Coordinates coordinates) {
        map[coordinates.getY()][coordinates.getX()] = null;
    }

    public void setItem(Item item, Coordinates coordinates) {
        map[coordinates.getY()][coordinates.getX()] = item;
    }

    public void moveItem(Item item, Coordinates oldCoordinates, Coordinates newCoordinates) {
        removeItem(oldCoordinates);
        setItem(item, newCoordinates);
    }

    public boolean noObjectNear(Coordinates coordinates) {
        return ((map[coordinates.getY()][coordinates.getX()+1] == null)
                && (map[coordinates.getY()][coordinates.getX()-1] == null)
                && (map[coordinates.getY()+1][coordinates.getX()] == null)
                && (map[coordinates.getY()-1][coordinates.getX()] == null));
    }
    
}
