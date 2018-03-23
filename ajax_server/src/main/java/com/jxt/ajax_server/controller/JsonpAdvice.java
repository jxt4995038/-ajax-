package com.jxt.ajax_server.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@ControllerAdvice(basePackageClasses = com.jxt.ajax_server.controller.AjaxTest2.class)
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {

    public JsonpAdvice() {
        super("callback","jsonp");
    }
}
