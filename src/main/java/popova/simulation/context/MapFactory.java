package popova.simulation.context;

import popova.simulation.animals.Bear;
import popova.simulation.animals.Fox;
import popova.simulation.animals.Hare;
import popova.simulation.animals.Mouse;
import popova.simulation.gui.ForestMap;
import popova.simulation.humans.Hunter;
import popova.simulation.items.Berry;
import popova.simulation.items.Coordinates;

import java.util.List;
import java.util.Random;

import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;

public class MapFactory {

    public static int rand (int min, int max) {

        return (int)(Math.random()*((max-min)+1))+min;
    }


    public static void createMap(ForestMap forestMap) {
        //random generation numbers of items

        Random r = new Random();
        int initNumberFox = r.nextInt(10);
        int initNumberBear = r.nextInt(10);
        int initNumberHare = r.nextInt(10);
        int initNumberMouse = r.nextInt(10);
        int initNumberBerry = r.nextInt(40);
        int initNumberHunter = r.nextInt(5);

//        //constructor AnimalContext
//        AnimalContext animalContext = new AnimalContext (initNumberFox, initNumberBear, initNumberHare, initNumberMouse, initNumberBerry, initNumberHunter);

        //create animals, adding to lists




        for (int i=0; i<initNumberFox; i++) {

                int randFoodLevel = r.nextInt(4)+3;
                int randHealthLevel = r.nextInt(4)+3;
                int randSpeed = r.nextInt(6);
                List<Coordinates> free = forestMap.getFreeSpaces();
                int n = rand(0, free.size()-1);
                Coordinates coordinates = free.get(n);

                Fox fox = new Fox(randFoodLevel, randSpeed, randHealthLevel);

            forestMap.setItem(fox, coordinates);
        }

        for (int i=0; i<initNumberBear; i++) {
            Bear bear = Bear.create();
            animalContext.addBear(bear);
        }

        for (int i=0; i<initNumberHare; i++) {
            Hare hare = Hare.create();
            animalContext.addHare(hare);
        }

        for (int i=0; i<initNumberMouse; i++) {
            Mouse mouse = Mouse.create();
            animalContext.addMouse(mouse);
        }

        for (int i=0; i<initNumberBerry; i++) {
            Berry berry = Berry.create();
            animalContext.addBerry(berry);
        }

        for (int i=0; i<initNumberHunter; i++) {
            Hunter hunter = Hunter.create();
            animalContext.addHunter(hunter);
        }

        return animalContext;
    }
}
