package popova.simulation.animals;

import popova.simulation.items.Berry;
import popova.simulation.items.Coordinates;

import java.util.Random;

import static popova.simulation.animals.Bear.FoodLevelIncreaser.*;
import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;

public class Bear extends Animal {

    public static Bear create (){
        Random r = new Random();
        int randFoodLevel = r.nextInt(4)+3;
        int randHealthLevel = r.nextInt(4)+3;
        int randSpeed = r.nextInt(6);
        Coordinates coordinates = new Coordinates (r.nextInt(MAX_X), r.nextInt(MAX_Y));

        return new Bear (randFoodLevel, randSpeed, randHealthLevel, coordinates);
    }


    public Bear(int foodLevel, int speed, int healthLevel, Coordinates coordinates) {
        super(foodLevel, speed, healthLevel, coordinates);
    }

    public enum FoodLevelIncreaser {

        BERRY(1), MOUSE(2), FOX(6);
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
        } else if (eatenItem instanceof Mouse) {
            super.setFoodLevel(super.getFoodLevel() + MOUSE.getFoodLevelIncreasing());
        } else if (eatenItem instanceof Fox) {
            super.setFoodLevel(super.getFoodLevel() + FOX.getFoodLevelIncreasing());
        }

    }
}
