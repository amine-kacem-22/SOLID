package com.directi.training.srp.exercise;

import java.util.ArrayList;
import java.util.List;

public class CarManager
{
    private List<Car> _carsDb = new ArrayList<>();

    private Car bestCar = null;

    public void addCar(Car car) {
        _carsDb.add(car);
    }

    public void removeCar(String id) {
        _carsDb.removeIf(car -> car.getId().equals(id));
    }

    public Car getFromDb(final String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames() {
        if (_carsDb.isEmpty()) {
            return "No cars available";
        }
        
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar() {
        return bestCar;
    }

    public void setBestCar(String id) {
        bestCar = getFromDb(id);
    }
}
