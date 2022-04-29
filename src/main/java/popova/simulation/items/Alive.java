package popova.simulation.items;

public abstract class Alive extends Item{
    private int speed;


    public Alive(int speed, int healthLevel) {
        super(healthLevel);
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
