package com.demo.config;

import org.springframework.stereotype.Component;

@Component
public class LimitConfiguration {

    private String minimun;
    private String maximun;
    
    public LimitConfiguration() {
        super();
    }
    
    public LimitConfiguration(String minimun, String maximun) {
        super();
        this.minimun = minimun;
        this.maximun = maximun;
    }

    public String getMinimun() {
        return minimun;
    }

    public void setMinimun(String minimun) {
        this.minimun = minimun;
    }

    public String getMaximun() {
        return maximun;
    }

    public void setMaximun(String maximun) {
        this.maximun = maximun;
    }

    @Override
    public String toString() {
        return "LimitConfiguration [minimun=" + minimun + ", maximun=" + maximun + "]";
    }

}

