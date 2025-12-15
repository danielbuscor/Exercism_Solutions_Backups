class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int totalDistanceDriven; 
    private int totalBattery = 100;
    
    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getBattery() {
        return totalBattery;
    }
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryDrain > totalBattery;
    }

    public int distanceDriven() {
        return totalDistanceDriven;
    }

    public void drive() {
        if(totalBattery >= batteryDrain) {
            totalDistanceDriven += speed;
            totalBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int possibleDrives = car.getBattery() / car.getBatteryDrain();
        int possibleDistanceDriven = car.getSpeed() * possibleDrives;
        return possibleDistanceDriven >= distance;
    }
}
