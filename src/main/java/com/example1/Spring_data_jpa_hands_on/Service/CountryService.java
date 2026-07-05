package com.example1.Spring_data_jpa_hands_on.Service;

import com.example1.Spring_data_jpa_hands_on.exception.CountryNotFoundException;
import com.example1.Spring_data_jpa_hands_on.model.Country;
import com.example1.Spring_data_jpa_hands_on.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Transactional
    public Country getCountry(String code){
       return countryRepository.findById(code).orElse(null);
    }
    @Transactional
    public Country findCountryByCode(String countryCode)
            throws CountryNotFoundException {

        Optional<Country> result =
                countryRepository.findById(countryCode);

        if (!result.isPresent()) {
            throw new CountryNotFoundException(
                    "Country not found");
        }

        return result.get();
    }
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }
    @Transactional
    public void updateCountry(String code, String name)
            throws CountryNotFoundException {

        Optional<Country> result =
                countryRepository.findById(code);

        if (!result.isPresent()) {
            throw new CountryNotFoundException(
                    "Country not found");
        }

        Country country = result.get();

        country.setName(name);

        countryRepository.save(country);
    }
}
