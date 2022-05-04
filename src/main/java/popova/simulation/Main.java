package popova.simulation;

import popova.simulation.animals.Fox;
import popova.simulation.animals.Hare;
import popova.simulation.context.Controller;
import popova.simulation.gui.ForestMap;
import popova.simulation.humans.Hunter;
import popova.simulation.items.Coordinates;

public class Main {
    public static void main(String[] args) {
//        Controller controller = new Controller();
//
//        System.out.println(controller.getForestMap());

        ForestMap map = new ForestMap();
        Hare hare1 = new Hare(4,3,4);
        Hare hare = new Hare(3,4,3);
        map.setItem(hare1, new Coordinates(0, 0));
        map.setItem(hare, new Coordinates(0, 1));

        hare1.makeNewAnimal(map, 0, 0);
        System.out.println(map);

//
//        hunter.tryToKill(map, new Coordinates(0, 0));
////        System.out.println(hare.getHealthLevel());

    }
}
