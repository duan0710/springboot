package com.duan.jpa;

import com.duan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJPA extends JpaRepository<User,Long> {
}
