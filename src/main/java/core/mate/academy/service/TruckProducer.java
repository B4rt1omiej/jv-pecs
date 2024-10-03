package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Bulldozer X20", "Yellow", 2));
        truckList.add(new Truck("Bulldozer X10", "Yellow", 1));
        truckList.add(new Truck("Bulldozer X3", "Orange", 1));
        return truckList;
    }
}
