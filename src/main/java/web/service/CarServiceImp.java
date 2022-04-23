package web.service;

import org.springframework.stereotype.Service;
import web.data.CarData;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

   @Override
   public List<Car> getCars(int number) {
      return CarData.getListOfCars().subList(0, number);
   }
}
