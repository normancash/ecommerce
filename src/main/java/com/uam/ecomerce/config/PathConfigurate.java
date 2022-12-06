package com.uam.ecomerce.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class PathConfigurate implements WebMvcConfigurer {

    @Value("${ruta.archivos.imagen}")
    private  String pathFileImage;

    @Value("${ruta.imagen}")
    private  String pathImage;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler(pathImage)
                .addResourceLocations("file:/" + pathFileImage);
    }



}
