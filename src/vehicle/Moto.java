package vehicle;

public class Moto extends Vehicle implements Movable, Refillable, Repairable {
    private int petrol;

    public Moto(int posX, int posY, int money, boolean available, int petrol) {
        super(posX, posY, money, available);
        this.petrol = petrol;
    }

    @Override
    public boolean move(char pos) {
        if (!available || petrol < Movable.MOTOR_CONSUMPTION) return false;

        if (pos == 'x') {
            posX += Movable.MOTO;
        } else if (pos == 'y') {
            posY += Movable.MOTO;
        }
        petrol -= Movable.MOTOR_CONSUMPTION;
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
    public boolean refill() {
        if (!available || money < Refillable.MOTO || petrol == Refillable.MOTO) return false;

        int toFill = Refillable.MOTO - petrol;
        money -= toFill * PRICE;
        petrol = Refillable.MOTO;
        return true;
    }

    @Override
    public boolean repair() {
        if (available || money < Repairable.MOTO) return false;
        money -= Repairable.MOTO;
        available = true;
        return true;
    }

    @Override
    public String toString() {
        return "Moto: petrol=" + petrol + ", "
               + super.toString();
    }
}
