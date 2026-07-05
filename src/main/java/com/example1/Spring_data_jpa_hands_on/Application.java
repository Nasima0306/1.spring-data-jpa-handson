package com.example1.Spring_data_jpa_hands_on;

import com.example1.Spring_data_jpa_hands_on.Service.CountryService;
import com.example1.Spring_data_jpa_hands_on.exception.CountryNotFoundException;
import com.example1.Spring_data_jpa_hands_on.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(Application.class);

    private static CountryService countryService;

	public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(Application.class);
        countryService=context.getBean(CountryService.class);
        testGetAllCountries();

	}
    private static void testGetAllCountries() {


        LOGGER.info("Start");

        countryService.deleteCountry("ZZ");

        LOGGER.info("Country deleted");

        LOGGER.info("End");
    }
}
