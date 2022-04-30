package popova.simulation.items;

import popova.simulation.interfaces.Eatable;

import java.util.Random;

import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;

public class Berry extends Item implements Eatable {
//    private final Coordinates coordinates;
//
//    public static Berry create() {
//        Random r = new Random();
//        Coordinates coordinates = new Coordinates(r.nextInt(MAX_X), r.nextInt(MAX_Y));
//
//        return new Berry(coordinates);
//    }

    public Berry(){
        super(1);
    }

    @Override
    public int getFoodLevelIncreasing() {
        return 1;
    }
}
