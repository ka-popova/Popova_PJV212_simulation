package popova.simulation.animals;

import popova.simulation.items.Berry;
import popova.simulation.items.Coordinates;

import java.util.Random;

import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;
import static popova.simulation.animals.Hare.FoodLevelIncreaser.BERRY;

public class Hare extends Animal{

        public static Hare create (){
            Random r = new Random();
            int randFoodLevel = r.nextInt(4)+3;
            int randHealthLevel = r.nextInt(4)+3;
            int randSpeed = r.nextInt(6);
            Coordinates coordinates = new Coordinates (r.nextInt(MAX_X), r.nextInt(MAX_Y));

            return new Hare (randFoodLevel, randSpeed, randHealthLevel, coordinates);
        }


        public Hare(int foodLevel, int speed, int healthLevel, Coordinates coordinates) {
            super(foodLevel, speed, healthLevel, coordinates);
        }

        public enum FoodLevelIncreaser {

            BERRY(2);
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
