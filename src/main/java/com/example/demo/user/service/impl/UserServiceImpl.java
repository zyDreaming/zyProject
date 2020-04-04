package com.example.demo.user.service.impl;

import com.example.demo.user.dao.UserDao;
import com.example.demo.user.entity.User;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

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
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserService userService;
    @Override
    public List<User> findUser(String userid) {
        return null;
    }

    @Override
    public List<String> queryUserOwnedRoleCodes(String userName) {
        return null;
    }

    /**查询所有用户列表*/
    @GetMapping(value = "/users")
    @Override
    public List<User> findAll() {
        return userService.findAll();
    }

    @Override
    public List<User> findAll(Sort sort) {
        return userService.findAll(sort);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @Override
    public List<User> findAllById(Iterable<String> strings) {
        return userService.findAllById(strings);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<User> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public User getOne(String s) {
        return null;
    }

    @Override
    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }
}