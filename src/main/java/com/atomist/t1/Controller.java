package com.atomist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {   

    @RequestMapping(path = "/")
    public String home() {
        return "Hello REST Microservice World";
    }
    
     @RequestMapping(path = "/3")
    public String home3() {
        return "Hello REST Microservice World";
    }
    
 
}
