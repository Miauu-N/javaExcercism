
class NeedForSpeed {
    public final int speed;
    public final int batteryDrain;
    private int battery = 100;
    private int distance = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryDrain > battery;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            this.battery -= this.batteryDrain;
            this.distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    public int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
