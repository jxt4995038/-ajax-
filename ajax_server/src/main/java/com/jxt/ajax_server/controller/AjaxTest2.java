package com.jxt.ajax_server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("jsonp")
public class AjaxTest2 {
    //使用jsonp来解决跨域,jsonp的配置类为JsonpAdvice
    @RequestMapping("test")
    public Map<String,String> jsonpTest(){
        return new HashMap<String,String>(){{put("success","jsonp");}};
    }
}
