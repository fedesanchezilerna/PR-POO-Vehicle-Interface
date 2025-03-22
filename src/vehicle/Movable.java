package vehicle;

public interface Movable {
    static final int CAR = 10;
    static final int MOTO = 8;
    static final int TRUCK = 7;
    static final int BIKE = 3;
    static final int CAR_CONSUM = 10;
    static final int MOTOR_CONSUMPTION = 4;
    static final int TRUCK_CONSUM = 6;

    boolean move(char pos);

    boolean collision();
}
