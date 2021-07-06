package com.digitalInovation.misael.citiesapi.countries.repository;

import com.digitalInovation.misael.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
