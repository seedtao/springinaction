package com.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/03/01
 * Time  14:53
 */

//  这里  @Component 与 @Controller 可以算做是等价的

@Controller
public class HomeController {

    @RequestMapping("/index.do")
    public String home() {
        return "index";
    }

}
