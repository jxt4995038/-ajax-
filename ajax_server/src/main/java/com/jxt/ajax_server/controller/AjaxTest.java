package com.jxt.ajax_server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "ajax")
public class AjaxTest {

    //设置请求头来解决跨域
    @RequestMapping(value = "test")
    public Map<String,String> test(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
        Map<String,String> resultMap = new HashMap<>();
        resultMap.put("success","hello");
        return resultMap;
    }

}
