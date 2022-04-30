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
}
