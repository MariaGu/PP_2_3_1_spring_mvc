package web.data;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarData {

    public static List<Car> getListOfCars() {

        List<Car> listOfCars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            car.setModel("honda" + i);
            car.setHorsePower(i + 100);
            car.setSeries(10 + i);
            listOfCars.add(car);
        }
        return listOfCars;
    }
}
