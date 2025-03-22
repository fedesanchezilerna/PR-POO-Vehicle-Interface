package vehicle;

public interface Repairable {
    static final int CAR = 500;
    static final int MOTO = 30;
    static final int TRUCK = 400;
    static final int BIKE = 50;

    boolean repair();
}
