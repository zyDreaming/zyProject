package com.example.demo.user.dao;

import com.example.demo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

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
@Repository("userDao")
public interface UserDao  extends JpaRepository<User,Integer> {

    @Query(value ="SELECT LOGINNAME FROM sys_user",nativeQuery = true)
    List<String> findAllBySql();
}