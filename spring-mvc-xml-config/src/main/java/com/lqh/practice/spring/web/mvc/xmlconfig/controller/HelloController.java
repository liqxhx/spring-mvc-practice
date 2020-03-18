package com.lqh.practice.spring.web.mvc.xmlconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p> 类描述: Hello World Controller
 *
 * @author liqxhx
 * @version 1.0
 * @date 2020/03/17 23:13
 * @since 2020/03/17 23:13
 */
@Controller
public class HelloController {
    @RequestMapping("")
    public String index() {
        return "index";
    }
}
