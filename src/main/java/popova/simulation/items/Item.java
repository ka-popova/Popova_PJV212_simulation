package popova.simulation.items;

public abstract class Item {
//    private Coordinates coordinates;
//
//    public Coordinates getCoordinates() { return coordinates;}
//    public void setCoordinates(int x, int y) {
//
//    }

    private int speed;

    public Item(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
