package com.keycloak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Aux072 on 14/08/2018.
 */
@RestController
@RequestMapping("/api")
public class MyTestRestController {

    static Map<Integer, String> staffMap = new HashMap<>();
    static Map<Integer, String> studMap = new HashMap<>();

    @RequestMapping(value = "staff/getAll", method = RequestMethod.GET)
    public List<String> getAllStaff() {
        return new ArrayList<String>(staffMap.values());
    }

    @RequestMapping(value = "stud/getAll", method = RequestMethod.GET)
    public List<String> getAllStud() {
        return new ArrayList<String>(studMap.values());
    }

    @RequestMapping(value = "staff/getStaffById", method = RequestMethod.GET)
    public String getStaffById(@RequestParam("staffId") Integer staffId) {
        return staffMap.get(staffId);
    }

    @RequestMapping(value = "stud/getStudById", method = RequestMethod.GET)
    public String getStudById(@RequestParam("studId") Integer studId) {
        return studMap.get(studId);
    }

    @PostConstruct
    public void init() {
        staffMap.put(1,"Staff 1");
        staffMap.put(2,"Staff 2");
        staffMap.put(3,"Staff 3");
        staffMap.put(4,"Staff 4");
        staffMap.put(5,"Staff 5");
        studMap.put(1,"Stud 1");
        studMap.put(2,"Stud 2");
        studMap.put(3,"Stud 3");
        studMap.put(4,"Stud 4");
        studMap.put(5,"Stud 5");


    }
}
