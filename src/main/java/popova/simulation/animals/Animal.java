package popova.simulation.animals;

import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

public abstract class Animal extends Item {
    private int foodLevel;
    private int healthLevel;
//    private Coordinates coordinates;

    protected Animal(int foodLevel, int speed, int healthLevel /*,Coordinates coordinates*/) {
        super(speed, healthLevel);
        this.foodLevel = foodLevel;
//        this.coordinates = coordinates;
    }

    public int getFoodLevel() {
        return foodLevel;
    }


    public void setFoodLevel (int foodLevel){
        this.foodLevel = foodLevel;
    }

//    public Coordinates getCoordinates() { return coordinates;}

    public abstract void eat(Item eatenItem);

//    public void wound(Coordinates hunterCoordinates){
//        if (hunterCoordinates.isNear(this.coordinates)){
//            this.healthLevel = 0;
//        }
//        return;
//    }


    
}
