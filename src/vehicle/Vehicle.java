package vehicle;

public abstract class Vehicle {
    protected int posX;
    protected int posY;
    protected int money;
    protected boolean available;

    public Vehicle(int posX, int posY, int money, boolean available) {
        this.posX = posX;
        this.posY = posY;
        this.money = money;
        this.available = available;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "pos[" + posX +
               ", " + posY +
               "], $=" + money +
               ", available=" + available +
               ']';
    }
}
