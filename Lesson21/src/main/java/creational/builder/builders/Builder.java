package creational.builder.builders;

import creational.builder.bikes.Types;
import creational.builder.bikes.components.Engine;
import creational.builder.bikes.components.Transmission;
import creational.builder.bikes.components.TripComputer;

public interface Builder {
    public void setType(Types type);

    public void setSeats(int seats);

    public void setEngine(Engine engine);

    public void setTreansmission(Transmission transmission);

    public void setTripComputer(TripComputer tripComputer);

}
