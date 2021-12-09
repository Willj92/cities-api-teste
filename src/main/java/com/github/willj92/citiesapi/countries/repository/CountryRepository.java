package com.github.willj92.citiesapi.countries.repository;

import com.github.willj92.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
