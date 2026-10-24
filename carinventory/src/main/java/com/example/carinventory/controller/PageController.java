
package com.example.carinventory.controller;

import com.example.carinventory.model.Car;
import com.example.carinventory.repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {

    private final CarRepository carRepository;

    public PageController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/dashboard";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<Car> cars = carRepository.findAll();

        long available = cars.stream()
                .filter(car -> car.getStatus() != null
                        && car.getStatus().equalsIgnoreCase("Available"))
                .count();

        long sold = cars.stream()
                .filter(car -> car.getStatus() != null
                        && car.getStatus().equalsIgnoreCase("Sold"))
                .count();

        model.addAttribute("totalCars", cars.size());
        model.addAttribute("availableCars", available);
        model.addAttribute("soldCars", sold);

        return "dashboard";
    }
}
