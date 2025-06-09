package com.jsp.service.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        Collections.sort(al);
        return al;
    }
    public boolean anagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] str1Arr = str1.toLowerCase().toCharArray();
        char[] str2Arr = str2.toLowerCase().toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        return Arrays.equals(str1Arr, str2Arr);

    }
}
