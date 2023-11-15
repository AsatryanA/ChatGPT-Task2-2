package com.epam.chatgpttask22.repository;

import com.epam.chatgpttask22.entity.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {

    Optional<WeatherData> findByCity(String city);

    Optional<WeatherData> findByZipCode(String zipCode);
}
