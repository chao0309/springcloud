package cn.how2j.springcloud.service;

import cn.how2j.springcloud.dao.UserDao;
import cn.how2j.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User selectUserBuName(String name){
        return userDao.findUserByName(name);
    }

    public List selectAllUser(){
        return userDao.findAllUser();
    }

    public void insertUser(){
        userDao.insertUser("SnailClimb", 22, 3000.0);
        userDao.insertUser("Daisy", 19, 3000.0);
    }

    public void deleteUser(int id){
        userDao.deleteUser(id);
    }

    @Transactional
    public void changeMoney(){
        userDao.updateUser("SnailClimb", 22, 2000.0, 8);
    }
}
