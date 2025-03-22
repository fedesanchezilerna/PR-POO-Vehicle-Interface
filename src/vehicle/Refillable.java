package vehicle;

public interface Refillable {
    static final int CAR = 100;
    static final int MOTO = 50;
    static final int TRUCK = 200;
    static final int PRICE = 1;

    boolean refill();
}
