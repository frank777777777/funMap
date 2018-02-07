package me.funmap.dao.interfaces;

import me.funmap.model.User;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

    User getUser(Long id);

    void registerUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);


}
