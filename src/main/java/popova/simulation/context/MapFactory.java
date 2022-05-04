package popova.simulation.context;

import popova.simulation.animals.Bear;
import popova.simulation.animals.Fox;
import popova.simulation.animals.Hare;
import popova.simulation.animals.Mouse;
import popova.simulation.gui.ForestMap;
import popova.simulation.humans.Hunter;
import popova.simulation.items.Berry;
import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

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
        int initNumberFox = rand(3,20);
        int initNumberBear = rand(3,20);
        int initNumberHare = rand(3,20);
        int initNumberMouse = rand(3,20);
        int initNumberBerry = rand(30,100);
        int initNumberHunter = rand(3,10);



//        //constructor AnimalContext
//        AnimalContext animalContext = new AnimalContext (initNumberFox, initNumberBear, initNumberHare, initNumberMouse, initNumberBerry, initNumberHunter);

        //create animals, adding to lists




        for (int i=0; i<initNumberFox; i++) {
            Fox fox = createFox();
            List<Coordinates> free = forestMap.getFreeSpaces();
            int n = rand(0, free.size()-1);
            Coordinates coordinates = free.get(n);

            forestMap.setItem(fox, coordinates);
        }

        for (int i=0; i<initNumberBear; i++) {
            Bear bear = createBear();
            List<Coordinates> free = forestMap.getFreeSpaces();
            int n = rand(0, free.size()-1);
            Coordinates coordinates = free.get(n);

            forestMap.setItem(bear, coordinates);
        }

        for (int i=0; i<initNumberHare; i++) {
            Hare hare = createHare();
            List<Coordinates> free = forestMap.getFreeSpaces();
            int n = rand(0, free.size()-1);
            Coordinates coordinates = free.get(n);

            forestMap.setItem(hare, coordinates);
    }

        for (int i=0; i<initNumberMouse; i++) {
            Mouse mouse = createMouse();
            List<Coordinates> free = forestMap.getFreeSpaces();
            int n = rand(0, free.size()-1);
            Coordinates coordinates = free.get(n);

            forestMap.setItem(mouse, coordinates);
        }

        for (int i=0; i<initNumberBerry; i++) {
            List<Coordinates> free = forestMap.getFreeSpaces();
            int n = rand(0, free.size()-1);
            Coordinates coordinates = free.get(n);

            Berry berry = new Berry();

            forestMap.setItem(berry, coordinates);
        }

        for (int i=0; i<initNumberHunter; i++) {
            int randSpeed = rand(3, 8);
            int randAccuracy = rand(3, 9);
            int randKillingItems = rand(5, 20);
            List<Coordinates> free = forestMap.getFreeSpaces();
            int n = rand(0, free.size()-1);
            Coordinates coordinates = free.get(n);

            Hunter hunter = new Hunter(randSpeed, randAccuracy, randKillingItems);

            forestMap.setItem(hunter, coordinates);
        }
    }

    public static Bear createBear(){
        int randFoodLevel = rand(6, 20);
        int randHealthLevel = rand(3, 10);
        int randSpeed = rand(0, 4);

        Bear bear = new Bear(randFoodLevel, randSpeed, randHealthLevel);
        return bear;
    }

    public static Fox createFox() {
        int randFoodLevel = rand(3, 10);
        int randHealthLevel = rand(3, 10);
        int randSpeed = rand(0, 5);
        Fox fox = new Fox(randFoodLevel, randSpeed, randHealthLevel);
        return fox;
    }

    public static Hare createHare() {
        int randFoodLevel = rand(2, 5);
        int randHealthLevel = rand(3, 10);
        int randSpeed = rand(0, 5);
        Hare hare = new Hare(randFoodLevel, randSpeed, randHealthLevel);
        return hare;
    }

    public static Mouse createMouse() {
        int randFoodLevel = rand(1, 3);
        int randHealthLevel = rand(3, 10);
        int randSpeed = rand(0, 3);
        Mouse mouse = new Mouse(randFoodLevel, randSpeed, randHealthLevel);
        return mouse;
    }

    public static void randomLocate(ForestMap forestMap, Item item) {
        List<Coordinates> free = forestMap.getFreeSpaces();
        int n = rand(0, free.size()-1);
        Coordinates coordinates = free.get(n);

        forestMap.setItem(item, coordinates);

    }


}
