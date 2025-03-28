package vehicle;

public class Truck extends Vehicle implements Movable, Refillable, Repairable {
    private int petrol;

    public Truck(int posX, int posY, int money, boolean available, int petrol) {
        super(posX, posY, money, available);
        this.petrol = petrol;
    }

    @Override
    public boolean move(char pos) {
        if (!available || petrol < Movable.TRUCK_CONSUM) return false;

        if (pos == 'x') {
            posX += Movable.TRUCK;
        } else if (pos == 'y') {
            posY += Movable.TRUCK;
        }
        petrol -= Movable.TRUCK_CONSUM;
        return true;
    }

    @Override
    public boolean refill() {
        if (!available || money < Refillable.TRUCK || petrol == Refillable.TRUCK) return false;

        int toFill = Refillable.TRUCK - petrol;
        money -= toFill * PRICE;
        petrol = Refillable.TRUCK;
        return true;
    }

    @Override
    public boolean repair() {
        if (available || money < Repairable.TRUCK) return false;
        money -= Repairable.TRUCK;
        available = true;
        return true;
    }

    @Override
    public String toString() {
        return "Truck: petrol=" + petrol + ", "
               + super.toString();
    }
}
