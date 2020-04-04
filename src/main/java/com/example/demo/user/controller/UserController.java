package com.example.demo.user.controller;

import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: xAMS </p>
 * Description: <br>
 * Copyright: CorpRights xQuant.com<br>
 * Company: xQuant.com<br>
 *
 * @author AdolfZ
 * @version 4.0.0.0
 * @date 2020-04-03
 */
@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findUser")
    public String findUser(){
       return "user";
    }

}