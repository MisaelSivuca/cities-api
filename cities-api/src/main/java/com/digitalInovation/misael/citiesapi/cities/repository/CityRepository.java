package com.digitalInovation.misael.citiesapi.cities.repository;

import com.digitalInovation.misael.citiesapi.cities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
