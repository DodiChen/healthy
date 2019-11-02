package com.dodi.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chendong
 * @date 2019/11/2 23:25
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/list")
    public List<String> getUserList(){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        return list;
    }

}
