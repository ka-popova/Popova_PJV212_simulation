package popova.simulation.animals;

import popova.simulation.items.Coordinates;
import popova.simulation.items.Item;

public class Animal extends Item {
    private int foodLevel;
    private int healthLevel;
//    private Coordinates coordinates;

    protected Animal(int foodLevel, int speed, int healthLevel /*,Coordinates coordinates*/) {
        super(speed);
        this.foodLevel = foodLevel;
        this.healthLevel = healthLevel;
//        this.coordinates = coordinates;
    }

    public int getFoodLevel() {
        return foodLevel;
    }


    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setFoodLevel (int foodLevel){
        this.foodLevel = foodLevel;
    }

//    public Coordinates getCoordinates() { return coordinates;}

    public <T> void eat(T eatenItem){
        return;
    }

//    public void wound(Coordinates hunterCoordinates){
//        if (hunterCoordinates.isNear(this.coordinates)){
//            this.healthLevel = 0;
//        }
//        return;
//    }

    public boolean isKilled (){
        return this.healthLevel <= 0;
    }
    
}
