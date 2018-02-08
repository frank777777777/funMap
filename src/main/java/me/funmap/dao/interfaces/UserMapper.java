package me.funmap.dao.interfaces;

import me.funmap.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

    User getUser(@Param("id") Long id);

    void registerUser(@Param("user") User user);

    void updateUser(@Param("user") User user);

    void deleteUser(@Param("id") Long id);

    List<User> searchUser(@Param("token") String token);


}
