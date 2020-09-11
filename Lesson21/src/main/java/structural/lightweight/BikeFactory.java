package structural.lightweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BikeFactory {
    static Map<String, BikeType> bikeTypeMap = new HashMap<>();

    public static BikeType getBikeType(String model, Color color) {

        BikeType result = bikeTypeMap.get(model + color);

        if (result == null) {
            result = new BikeType(model, color);
            bikeTypeMap.put(model + color, result);
        }
        return result;

    }
}
