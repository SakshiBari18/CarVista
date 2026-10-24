
package com.example.carinventory.repository;

import com.example.carinventory.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
