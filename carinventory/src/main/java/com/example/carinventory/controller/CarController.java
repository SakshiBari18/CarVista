
package com.example.carinventory.controller;

import com.example.carinventory.model.Car;
import com.example.carinventory.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String listCars(
            @RequestParam(required = false) String keyword,
            Model model) {

        model.addAttribute("cars",
                carService.searchCars(keyword));
        model.addAttribute("keyword", keyword);

        return "cars";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("car", new Car());
        return "car-form";
    }

    @PostMapping("/save")
    public String saveCar(@ModelAttribute("car") Car car) {
        carService.saveCar(car);
        return "redirect:/cars";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(
            @PathVariable Long id, Model model) {

        model.addAttribute("car",
                carService.getCarById(id));

        return "car-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return "redirect:/cars";
    }
}
