package popova.simulation.animals;

import popova.simulation.items.Berry;
import popova.simulation.items.Coordinates;

import java.util.Random;

import static popova.simulation.animals.Hare.FoodLevelIncreaser.BERRY;
import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;

public class Mouse extends Animal {

    public static Mouse create() {
        Random r = new Random();
        int randFoodLevel = r.nextInt(4) + 3;
        int randHealthLevel = r.nextInt(4) + 3;
        int randSpeed = r.nextInt(6);
        Coordinates coordinates = new Coordinates(r.nextInt(MAX_X), r.nextInt(MAX_Y));

        return new Mouse(randFoodLevel, randSpeed, randHealthLevel, coordinates);
    }

    public Mouse(int foodLevel, int speed, int healthLevel, Coordinates coordinates) {
        super(foodLevel, speed, healthLevel, coordinates);
    }

    public enum FoodLevelIncreaser {

        BERRY(4);
        private int foodLevelIncreasing;

        FoodLevelIncreaser(int foodLevelIncreasing) {
            this.foodLevelIncreasing = foodLevelIncreasing;
        }

        public int getFoodLevelIncreasing() {
            return foodLevelIncreasing;
        }
    }


    @Override
    public <T> void eat(T eatenItem) {
        if (eatenItem instanceof Berry) {
            super.setFoodLevel(super.getFoodLevel() + BERRY.getFoodLevelIncreasing());
        }
    }
}

