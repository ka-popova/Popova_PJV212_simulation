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

//        Hare hare1 = new Hare(4,3,4);
        Hare hare = new Hare(3,4,3);
        Hunter hunter = new Hunter(5, 10,6,10);
//        map.setItem(hare1, new Coordinates(0, 5));
        map.setItem(hare, new Coordinates(0, 7));
        map.setItem(hunter, new Coordinates(3, 8));
        System.out.println(map);
        System.out.println("---------------------");

//        hare.move(map, 8, 7);
        hunter.move(map, 3, 8);

        System.out.println(map);

//
//        hunter.tryToKill(map, new Coordinates(0, 0));
////        System.out.println(hare.getHealthLevel());

    }
}
