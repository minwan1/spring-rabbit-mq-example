package com.wan.example.test2.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tests2")
public class Test2Controller {

    @Autowired
    private Test2Service test2Service;


    @RequestMapping(method = RequestMethod.GET)
    public String  test(){
        test2Service.test();
        return "zxcv";
    }
}