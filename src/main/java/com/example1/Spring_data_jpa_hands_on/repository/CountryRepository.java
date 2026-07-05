package com.example1.Spring_data_jpa_hands_on.repository;

import com.example1.Spring_data_jpa_hands_on.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,String> {
}
