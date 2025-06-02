package com.jsp.service.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
class DemoController {
    private DemoService demoService;

    public String getDemoMessage() {
        return demoService.getDemoMessage();
    }
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }
    @GetMapping("/demo")
    public ArrayList<String> alOps() {
        return demoService.alOps();
    }

}
