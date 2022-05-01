package popova.simulation.context;

import popova.simulation.gui.ForestMap;

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
            }
        }
    }
}
