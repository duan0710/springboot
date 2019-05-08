package com.duan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class DruidController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/dataSource")
    public String dataSource(){
        try{
            System.out.println("dataSource = "+dataSource);
            Connection conn=dataSource.getConnection();
            System.out.println("conn = "+conn);
            return "success";
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return "end";
    }
}
