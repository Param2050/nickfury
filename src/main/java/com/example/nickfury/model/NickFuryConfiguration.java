package com.example.nickfury.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class NickFuryConfiguration {

    @Autowired
    Environment environment;

    public String getProfileName() {
        return environment.getProperty("myservice.profile.name");
    }
}
