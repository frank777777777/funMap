package me.funmap.service.interfaces;

import me.funmap.model.User;

import java.util.List;

public interface UserSV {

    public User getUserById(Long id);


    public List<User> getUsers();


    public boolean removeUserById(Long id);

    public boolean registerUser(User user);

    public boolean updateUser(User user);

    public List<User> searchUsers(String userName);
}
