package com.example.nickfury;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class nickfurycontroller {

    @Value("${myservice.profile.name}")
    private String serviceValue;

    @GetMapping("nickfury/v1/service")
    public String getServiceValue() {
        return "Service value " + serviceValue;
    }


}
