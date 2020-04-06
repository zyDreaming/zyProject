package com.example.demo.user.service;

import com.example.demo.user.entity.User;

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
public interface UserService {

    List<User>  findAll();
    List<String> findAllBySql();

}