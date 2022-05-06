package popova.simulation.context;

import popova.simulation.animals.Animal;
import popova.simulation.gui.ForestMap;
import popova.simulation.interfaces.Killer;
import popova.simulation.interfaces.Moveable;
import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

public class Controller {

    private ForestMap forestMap = new ForestMap();
    public Controller() {
        MapFactory.createMap(forestMap);
    }

    public ForestMap getForestMap() {
        return forestMap;
    }

    public void iterate() {
        Size mapSize = forestMap.getSize();
        for (int y = 0; y < mapSize.getHeight(); y++) {
            for (int x = 0; x < mapSize.getWidth(); x++) {
                Coordinates coordinates = new Coordinates(x, y);
                Item item = forestMap.getItem(coordinates);
                if (item == null) {
                    continue;
                }
                if (item instanceof Killer killer) {
                    if (killer.tryToKill(forestMap, coordinates)) {
                        continue;
                    }
                }
                if (item instanceof Animal animal) {
                    if (animal.makeNewAnimal(forestMap, x, y)) {
                        continue;
                    }
                }
                if (item instanceof Moveable moveable) {
                    moveable.move(forestMap, x, y);
                }





            }
        }
        clear();


    }

    private void clear() {
        Size mapSize = forestMap.getSize();
        for (int y = 0; y < mapSize.getHeight(); y++) {
            for (int x = 0; x < mapSize.getWidth(); x++) {
                Coordinates coordinates = new Coordinates(x, y);
                Item item = forestMap.getItem(coordinates);
                if (item != null && item.isKilled()) {
                    forestMap.removeItem(item, coordinates);
                }
            }
        }


    }
}
