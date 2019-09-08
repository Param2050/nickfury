package com.example.nickfury;


import com.example.nickfury.model.NickFuryConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nickfury/v1/")
public class controller {

    @Autowired
    NickFuryConfiguration nickFuryConfiguration;

    @GetMapping("/config")
    public NickFuryConfiguration getNickFuryProperty() {
        return nickFuryConfiguration;
    }
}
