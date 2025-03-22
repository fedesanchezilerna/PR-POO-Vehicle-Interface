package vehicle;

public class Car extends Vehicle implements Movable, Refillable, Repairable {
    private int petrol;

    public Car(int posX, int posY, int money, boolean available, int petrol) {
        super(posX, posY, money, available);
        this.petrol = petrol;
    }


    @Override
    public boolean move(char pos) {
        if (!available || petrol < Movable.CAR_CONSUM) return false;

        if (Character.toLowerCase(pos) == 'x') {
            posX += Movable.CAR;
        } else if (Character.toLowerCase(pos) == 'y') {
            posY += Movable.CAR;
        }
        petrol -= Movable.CAR_CONSUM;
        return false;
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
    public boolean refill() {
        if (!available || money < Refillable.CAR || petrol == Refillable.CAR) return false;

        int toFill = Refillable.CAR - petrol;
        money -= toFill * PRICE;
        return true;
    }

    @Override
    public boolean repair() {
        if (available || money < Repairable.CAR) return false;
        money -= Repairable.CAR;
        available = true;
        return true;
    }
}
