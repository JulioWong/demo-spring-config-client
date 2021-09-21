package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    
    @Autowired
    private Configuration configuration;
    
    @Value("${limits-service.minimum}")
    private String minimun;
    
    @GetMapping(path="/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
    
    @GetMapping(path="/foo")
    public String foo() {
    	return String.format("Foo %s", minimun);
    }

}