package com.duan.controller;

import com.duan.entity.User;
import com.duan.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表
     * @return 用户列表信息
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public List<User> list(){
        return userJPA.findAll();
    }

    /**
     * 更新或保存用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public User save(User user){
        return userJPA.save(user);
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/del",method = RequestMethod.GET)
    public List<User> delete(Long id){
        userJPA.deleteById(id);
        return userJPA.findAll();
    }

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public List<User> findByName(String name){
        return userJPA.findUserByName(name);
    }
}
