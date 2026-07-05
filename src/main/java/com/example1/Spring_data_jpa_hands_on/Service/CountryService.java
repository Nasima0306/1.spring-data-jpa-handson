package com.example1.Spring_data_jpa_hands_on.Service;

import com.example1.Spring_data_jpa_hands_on.model.Country;
import com.example1.Spring_data_jpa_hands_on.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Transactional
    public Country getCountry(String code){
       return countryRepository.findById(code).orElse(null);
    }
}
