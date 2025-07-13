package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @PostMapping
    public Country addCountry(@RequestBody @Valid Country country) {
        LOGGER.info("Start");
        LOGGER.info("Country: code={}, name={}", country.getCode(), country.getName());
        return country;
    }
}