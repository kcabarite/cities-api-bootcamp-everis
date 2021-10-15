package com.gitlab.klebercabarite.citiesapi.countries.repository;

import com.gitlab.klebercabarite.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
