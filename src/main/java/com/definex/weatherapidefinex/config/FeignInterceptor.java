package com.definex.weatherapidefinex.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FeignInterceptor implements RequestInterceptor {

    @Value("${X-RapidAPI-Key}")
    private String rapidApiKey;
    @Value("${X-RapidAPI-Host}")
    private String rapidApiHost;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("X-RapidAPI-Key", rapidApiKey).header("X-RapidAPI-Host", rapidApiHost);
    }
}
