package popova.simulation;

import popova.simulation.animals.Fox;
import popova.simulation.animals.Hare;
import popova.simulation.context.Controller;
import popova.simulation.gui.ForestMap;
import popova.simulation.items.Coordinates;

public class Main {
    public static void main(String[] args) {
//        Controller controller = new Controller();

//        System.out.println(controller.getForestMap());

        ForestMap map = new ForestMap();
        Fox fox = new Fox(4,3,4);
        Hare hare = new Hare(3,4,3);
        map.setItem(fox, new Coordinates(19, 10));
        map.setItem(hare, new Coordinates(18, 10));

        fox.tryToKill(map, new Coordinates(19, 10));
        System.out.println(hare.getHealthLevel());

    }
}
