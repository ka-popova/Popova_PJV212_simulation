package popova.simulation.items;

public abstract class Item {
//    private Coordinates coordinates;
//
//    public Coordinates getCoordinates() { return coordinates;}
//    public void setCoordinates(int x, int y) {
//
//    }

    private int speed;
    private int healthLevel;

    public Item(int speed, int healthLevel) {
        this.speed = speed;
        this.healthLevel = healthLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public boolean isKilled (){
        return healthLevel <= 0;
    }

    public void setHealthToZero() {
        healthLevel = 0;
    }
}
