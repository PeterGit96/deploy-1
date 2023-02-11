package co.develhope.deploy1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {

    @Value("${myCustomEnvs.devName}")
    private String devName;

    @GetMapping
    public String getDevName() {
        return devName;
    }

}