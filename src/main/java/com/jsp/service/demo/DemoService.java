package com.jsp.service.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.AbstractList;
import java.util.ArrayList;

@Service
class DemoService {

    private Logger logger = LoggerFactory.getLogger(DemoService.class);
    private ArrayList<String> al = new ArrayList<String>();
    public String getDemoMessage() {
        return "Hello World!";
    }
    public ArrayList<String> alOps() {
        al.add("Suzuki");
        al.add("Yamaha");
        al.add("Honda");
        al.add("Toyota");
        al.add("BMW");
        al.add("Honda");
        al.add("Toyota");
        al.add("BMW");
        al.add("Honda");
        al.add("Toyota");
        logger.info("ArrayList size: {}", al.size());
        logger.info("ArrayList: {}", al);
        return al;
    }
}
