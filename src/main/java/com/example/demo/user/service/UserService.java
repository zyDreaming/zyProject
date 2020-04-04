package com.example.demo.user.service;

import com.example.demo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
public interface UserService   extends JpaRepository<User,String> {

    List<User>  findUser(String userid);

    @Query(value = "select r.username from sys_ser u where u.userName = :userName")
    List<String> queryUserOwnedRoleCodes(@Param(value = "userName") String userName);
}