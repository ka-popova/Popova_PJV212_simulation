package popova.simulation.items;

import java.util.Random;

import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;

public class Berry implements Item {
    private final Coordinates coordinates;

    public static Berry create() {
        Random r = new Random();
        Coordinates coordinates = new Coordinates(r.nextInt(MAX_X), r.nextInt(MAX_Y));

        return new Berry(coordinates);
    }

    protected Berry(Coordinates coordinates) {
        this.coordinates = coordinates;

    }
}
