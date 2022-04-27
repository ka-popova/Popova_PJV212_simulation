package popova.simulation.animals;

import popova.simulation.gui.ForestMap;
import popova.simulation.interfaces.Moveable;
import popova.simulation.items.Berry;
import popova.simulation.items.Coordinates;

import java.util.Random;

import static popova.simulation.animals.Fox.FoodLevelIncreaser.*;
import static popova.simulation.context.Utils.MAX_X;
import static popova.simulation.context.Utils.MAX_Y;

public class Fox extends Animal /*implements Moveable*/ {




    public Fox(int foodLevel, int speed, int healthLevel /*, Coordinates coordinates*/) {
        super(foodLevel, speed, healthLevel /*, coordinates*/);
    }

    public enum FoodLevelIncreaser {

        BERRY(1), MOUSE(2), HARE(6);
        private int foodLevelIncreasing;

        FoodLevelIncreaser(int foodLevelincreasing) {
            this.foodLevelIncreasing = foodLevelincreasing;
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
        } else if (eatenItem instanceof Hare) {
            super.setFoodLevel(super.getFoodLevel() + HARE.getFoodLevelIncreasing());
        }

    }

//    @Override
//    public void move(ForestMap map) {
//
//        if (map.noObjectNear(this.getCoordinates()) {
//            Random r = new Random();
//            int direction = r.nextInt (3);
//            int go = r.nextInt(this.getSpeed());

//        }

//
//        }
        // if (еще одна лиса isNear && у this-лисы уровень сытости максимальный && у второй лисы уровень сытости максимальный) {
        //     create
        // }

//        }
//        // if (Заяц isNear || Мышь isNear || && у this-лисы уровень сытости < максимального) {
//        //     eat
//        // }
//
}


