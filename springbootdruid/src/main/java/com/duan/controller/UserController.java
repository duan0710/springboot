package com.duan.controller;

import com.duan.entity.User;
import com.duan.jpa.UserJPA;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserJPA userJPA;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list(){
        return userJPA.findAll();
    }

    @RequestMapping("/save")
    @ResponseBody
    public User save(User user){
        return userJPA.save(user);
    }

    @RequestMapping("/del")
    @ResponseBody
    public List<User> del(Long id){
        userJPA.deleteById(id);
        return userJPA.findAll();
    }


}
