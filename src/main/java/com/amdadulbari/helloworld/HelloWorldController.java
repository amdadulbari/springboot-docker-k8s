package com.amdadulbari.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    ContainerInfoService containerInfoService;

    @GetMapping(path = "/")
    public String imUpAndRunning() {
        String hostName = "<h2>Hello!!<br>Host= " + containerInfoService.getContainerInfo()+"<br>Version= 5</h2>";
        return hostName;
    }

}
