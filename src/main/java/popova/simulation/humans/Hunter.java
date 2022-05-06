package popova.simulation.humans;

import popova.simulation.animals.Animal;
import popova.simulation.gui.ForestMap;
import popova.simulation.interfaces.Killer;
import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

import java.util.Random;

import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;

public class Hunter extends Human {
//    public static Hunter create (){
//        Random r = new Random();
//        int randSpeed = r.nextInt(6);
//        int randAccuracy = r.nextInt(5)+3;
//        int randKillingItemsCount = r.nextInt(10)+3;
//
//        Coordinates coordinates = new Coordinates (r.nextInt(MAX_X), r.nextInt(MAX_Y));
//
//        return new Hunter (randSpeed, randAccuracy, randKillingItemsCount, coordinates);
//    }

    public Hunter(int speed, int accuracy, int killingRange, int killingItemsCount/*, Coordinates coordinates*/) {
        super(speed, accuracy, killingRange, killingItemsCount/*, coordinates*/);

    }

    @Override
    public int getRange() {
        return 10;
    }

    private int getDistanceRight(ForestMap forestMap, int x, int y){
        for (int itemPos = x+1; itemPos < forestMap.getSize().getWidth(); x++) {
            Item item = forestMap.getItem(new Coordinates(itemPos, y));
            if (item != null) {
                if (item instanceof Animal){
                    return itemPos-x;
                }
                return -1;
            }
        }
        return -1;
    }

    private int getDistanceLeft(ForestMap forestMap, int x, int y){
        for (int itemPos = x-1; itemPos > forestMap.getSize().getWidth(); x--) {
            Item item = forestMap.getItem(new Coordinates(itemPos, y));
            if (item != null) {
                if (item instanceof Animal){
                    return x-itemPos;
                }
                return -1;
            }
        }
        return -1;
    }

    private int getDistanceDown(ForestMap forestMap, int x, int y){
        for (int itemPos = y+1; itemPos < forestMap.getSize().getWidth(); y++) {
            Item item = forestMap.getItem(new Coordinates(x, itemPos));
            if (item != null) {
                if (item instanceof Animal){
                    return itemPos-y;
                }
                return -1;
            }
        }
        return -1;
    }

    private int getDistanceUp(ForestMap forestMap, int x, int y){
        for (int itemPos = y-1; itemPos > forestMap.getSize().getWidth(); y--) {
            Item item = forestMap.getItem(new Coordinates(itemPos, y));
            if (item != null) {
                if (item instanceof Animal){
                    return y-itemPos;
                }
                return -1;
            }
        }
        return -1;
    }





    @Override
    public void move(ForestMap forestMap, int x, int y) {

//        defaultMove();
    }
}
