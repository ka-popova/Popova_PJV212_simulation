package popova.simulation.humans;

import popova.simulation.interfaces.Killer;
import popova.simulation.items.Coordinates;

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

    public Hunter(int speed, int accuracy, int killingItemsCount/*, Coordinates coordinates*/) {
        super(speed, accuracy, killingItemsCount/*, coordinates*/);

    }

    @Override
    public int getRange() {
        return 10;
    }
}
