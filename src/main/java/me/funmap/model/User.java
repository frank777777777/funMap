package me.funmap.model;

import org.apache.ibatis.type.JdbcType;

public class User {
    private Long id;
    private String userName;
    private String password;

    public User(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = passWord;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
