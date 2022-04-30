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

    public void iterate(){


        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
            }
        }
}
