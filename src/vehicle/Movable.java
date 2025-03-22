package vehicle;

public interface Movable {
    int CAR = 10;
    int MOTO = 8;
    int TRUCK = 7;
    int BIKE = 3;
    int CAR_CONSUM = 10;
    int MOTOR_CONSUMPTION = 4;
    int TRUCK_CONSUM = 6;

    boolean move(char pos);

    boolean collision();
}
