package com.ryan.blogweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/5/24 22:24
 * @Created by fyc
 */
@Controller
public class UserController extends BaseController {

    @GetMapping("/blogger/login")
    public String login(@RequestParam Map<String,Object> params){

        return "/index";
    }




}