package com.definex.weatherapidefinex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WeatherApiDefinexApplication {

    public WeatherApiDefinexApplication() {
    }

    public static void main(String[] args)  {
        SpringApplication.run(WeatherApiDefinexApplication.class, args);
    }

}
