package com.workspace.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljj
 * @create 2022-08-13-9:02
 */
@RestController
public class HelloController {
    @RequestMapping("/helloss")

    public String handle01(){
        return "hello HelloController";
    }
}
