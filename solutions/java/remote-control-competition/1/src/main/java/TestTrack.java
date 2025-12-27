import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        //creating a new ArrayList so I dont have to modify the original
        List<ProductionRemoteControlCar> sortedCars = new ArrayList<>(cars);
        sortedCars.sort(null);
        return sortedCars;
    }
}
