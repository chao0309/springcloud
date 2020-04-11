package cn.how2j.springcloud.controller;

import cn.how2j.springcloud.pojo.User;
import cn.how2j.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public User testQuery(){
        return userService.selectUserBuName("wangchao");
    }
    @RequestMapping("/insert")
    public List<User> testInsert() {
        userService.insertUser();
        return userService.selectAllUser();
    }


    @RequestMapping("/changemoney")
    public List<User> testchangemoney() {
        userService.changeMoney();
        return userService.selectAllUser();
    }

    @RequestMapping("/delete")
    public String testDelete() {
        userService.deleteUser(3);
        return "OK";
    }
}
