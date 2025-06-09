package com.jsp.service.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/demo")
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

    @PostMapping("/anagram")
    public boolean testAnagram(@RequestParam String str1, @RequestParam  String str2) {
        if(str1 == null || str2 == null) {
            return false;
        }
        return demoService.anagram(str1, str2);
    }

}
