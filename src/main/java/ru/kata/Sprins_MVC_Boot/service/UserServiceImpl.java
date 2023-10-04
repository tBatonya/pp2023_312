package ru.kata.Sprins_MVC_Boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.Sprins_MVC_Boot.dao.UserDAO;
import ru.kata.Sprins_MVC_Boot.entity.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    @Transactional
    public void addUsers(User user) {
        userDAO.addUsers(user);
    }

    @Override
    @Transactional
    public User userById(Long id) {
        return userDAO.userById(id);
    }

    @Override
    @Transactional
    public User update(User user) {
        return userDAO.update(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDAO.delete(id);
    }
}
