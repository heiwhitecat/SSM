package com.ljjboot.coctroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljj
 * @create 2022-08-13-9:02
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")

    public String handle01(){
        return "hello HelloController";
    }
}
