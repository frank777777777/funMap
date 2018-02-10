package me.funmap.dao;

import me.funmap.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper {

    List<User> getAll();

    User getUser(@Param("id") Long id);

    void registerUser(@Param("user") User user);

    void updateUser(@Param("user") User user);

    void deleteUser(@Param("id") Long id);

    List<User> searchUser(@Param("token") String token);


}
