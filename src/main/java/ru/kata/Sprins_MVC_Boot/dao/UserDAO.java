package ru.kata.Sprins_MVC_Boot.dao;

import ru.kata.Sprins_MVC_Boot.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUser();
    public void addUsers(User user);

    public User userById(Long id);

    public User update(User user);

    public void delete(Long id);


}
