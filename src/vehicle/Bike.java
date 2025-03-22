package vehicle;

public class Bike extends Vehicle implements Movable, Repairable{
    public Bike(int posX, int posY, int money, boolean available) {
        super(posX, posY, money, available);
    }

    @Override
    public boolean move(char pos) {
        if (!available) return false;

        if (pos == 'x') {
            posX += Movable.BIKE;
        } else if (pos == 'y') {
            posY += Movable.BIKE;
        }
        return true;
    }

    @Override
    public boolean collision() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean repair() {
        if (available || money < Repairable.BIKE) return false;
        money -= Repairable.BIKE;
        available = true;
        return true;
    }

    @Override
    public String toString() {
        return "Bike: " + super.toString();
    }
}
