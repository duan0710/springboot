package com.duan.jpa;

import com.duan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserJPA extends JpaRepository<User,Long>{

    //自定义的接口方法
    List<User> findUserByName(String name);
}