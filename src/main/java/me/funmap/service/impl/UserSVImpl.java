package me.funmap.service.impl;
import me.funmap.dao.UserMapper;
import me.funmap.model.User;
import me.funmap.service.interfaces.UserSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserSVImpl implements UserSV {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public User getUserById(Long id) {
        User result = userMapper.getUser(id);
        return result;
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        return userMapper.getAll();
    }

    @Override
    @Transactional
    public boolean removeUserById(Long id) {
       userMapper.deleteUser(id);
       return true;
    }

    @Override
    @Transactional
    public boolean registerUser(User user) {
        userMapper.registerUser(user);
        return true;
    }

    @Override
    @Transactional
    public boolean updateUser(User user) {
        userMapper.updateUser(user);
        return true;
    }

    @Override
    @Transactional
    public List<User> searchUsers(String userName) {
        return userMapper.searchUser(userName);
    }
}
