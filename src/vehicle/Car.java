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

        if (pos == 'x') {
            posX += Movable.CAR;
        } else if (pos == 'y') {
            posY += Movable.CAR;
        }
        petrol -= Movable.CAR_CONSUM;
        return true;
    }

    @Override
    public boolean refill() {
        if (!available || money < Refillable.CAR || petrol == Refillable.CAR) return false;

        int toFill = Refillable.CAR - petrol;
        money -= toFill * PRICE;
        petrol = Refillable.CAR;
        return true;
    }

    @Override
    public boolean repair() {
        if (available || money < Repairable.CAR) return false;
        money -= Repairable.CAR;
        available = true;
        return true;
    }

    @Override
    public String toString() {
        return "Car: petrol=" + petrol + ", "
               + super.toString();
    }
}
