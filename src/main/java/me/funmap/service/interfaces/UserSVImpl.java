package me.funmap.service.interfaces;
import me.funmap.dao.UserMapper;
import me.funmap.model.User;
import me.funmap.service.impl.UserSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSVImpl implements UserSV {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        User result = userMapper.getUser(id);
        return result;
    }

    @Override
    public List<User> getUsers() {
        return userMapper.getAll();
    }

    @Override
    public boolean removeUserById(Long id) {
       userMapper.deleteUser(id);
       return true;
    }

    @Override
    public boolean registerUser(User user) {
        userMapper.registerUser(user);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        userMapper.updateUser(user);
        return true;
    }

    @Override
    public List<User> searchUsers(String userName) {
        return userMapper.searchUser(userName);
    }
}
