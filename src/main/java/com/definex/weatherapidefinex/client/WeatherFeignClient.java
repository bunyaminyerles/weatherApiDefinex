package com.definex.weatherapidefinex.client;

import com.definex.weatherapidefinex.config.CustomFeignClientConfiguration;
import com.definex.weatherapidefinex.model.RapidApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${app.feign.config.name}", url = "${app.feign.config.url}", configuration = CustomFeignClientConfiguration.class)
public interface WeatherFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/current.json")
    RapidApiResponse weatherByCity(@RequestParam(value = "q") String city);
    //RapidApiResponse weatherByCity(@Param("X-RapidAPI-Key")String k, @Param("X-RapidAPI-Host")String key2, @RequestParam(value = "q") String city);

}
