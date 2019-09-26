package com.example.nickfury;

import com.example.nickfury.model.NickFuryConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class NickfuryController {

    @Autowired
    private NickFuryConfiguration nickFuryConfiguration;

    @GetMapping("nickfury/v1/service")
    public String getServiceValue() {
        return "config " + nickFuryConfiguration.getProfileName();
    }

}
