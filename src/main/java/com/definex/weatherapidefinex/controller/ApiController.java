package com.definex.weatherapidefinex.controller;

import com.definex.weatherapidefinex.client.WeatherFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weather")
@RequiredArgsConstructor
public class ApiController {

    private final WeatherFeignClient apiClient;


    @GetMapping(value = "/{city}")
    public ResponseEntity createAirline (@PathVariable String city) {
        return ResponseEntity.ok(apiClient.weatherByCity(city));
    }


}
