
package com.example.carinventory.service;

import com.example.carinventory.model.Car;
import com.example.carinventory.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // Show all cars
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    // Find a car using its ID
    public Car getCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Car not found with ID: " + id));
    }

    // Add or update a car
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    // Delete a car
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    // Search cars by name, brand, or model
    public List<Car> searchCars(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return carRepository.findAll();
        }

        String search = keyword.trim().toLowerCase();

        return carRepository.findAll().stream()
                .filter(car ->
                        (car.getName() != null &&
                                car.getName().toLowerCase().contains(search))
                        ||
                        (car.getBrand() != null &&
                                car.getBrand().toLowerCase().contains(search))
                        ||
                        (car.getModel() != null &&
                                car.getModel().toLowerCase().contains(search))
                )
                .toList();
    }
}
