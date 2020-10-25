package com.przemyslawwolosz.module.config;


import com.przemyslawwolosz.core.ApplicationConfig;
import com.przemyslawwolosz.core.ApplicationConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRestController {

    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("api/config")
    public ApplicationConfigDto getConfig() {
        return applicationConfig.asDto();
    }
}
