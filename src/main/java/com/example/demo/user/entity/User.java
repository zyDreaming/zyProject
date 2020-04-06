package com.example.demo.user.entity;

import javax.persistence.*;

/**
 * <p>Title: xAMS </p>
 * Description: <br>
 * Copyright: CorpRights xQuant.com<br>
 * Company: xQuant.com<br>
 *
 * @author AdolfZ
 * @version 4.0.0.0
 * @date 2020-04-04
 */
@Entity
@Table(name = "SYS_USER")
public class User {
    @Id
    @Column(name = "USERID")
    @GeneratedValue
    private Integer userid;
    @Column(name = "LOGINNAME")
    private String loginname;
    @Column(name = "PASSWD")
    private String passwd;
    @Column(name = "USERNAME")
    private String username;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", loginname='" + loginname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}