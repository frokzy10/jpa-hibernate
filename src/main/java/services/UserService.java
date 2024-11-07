package services;

import dao.UserDao;
import lombok.NoArgsConstructor;
import models.Auto;
import models.User;

import java.util.List;

@NoArgsConstructor
public class UserService {
    private UserDao userDao = new UserDao();

    public User findUser(int id) {
        return userDao.findById(id);
    }
    public void saveUser(User user){
        userDao.save(user);
    }
    public void deleteUser(User user){
        userDao.delete(user);
    }
    public void updateUser(User user){
        userDao.update(user);
    }
    public List<User> findAllUser(){
        return userDao.findAll();
    }
    public Auto findAuto(int id) {
        return userDao.findAutoById(id);
    }
    public User deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }
}
