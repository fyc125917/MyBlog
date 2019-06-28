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
@RequestMapping("/blogger")
public class UserController extends BaseController {

    /**
     *@Desc: 更改头像
     */
    @GetMapping("/changeHeadPicture")
    public String login(@RequestParam Map<String,Object> params){
        System.out.println("asdaadasdasdada");
        return "index";
    }




}