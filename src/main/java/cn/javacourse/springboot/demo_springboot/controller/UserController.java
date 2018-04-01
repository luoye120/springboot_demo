package cn.javacourse.springboot.demo_springboot.controller;

import cn.javacourse.springboot.demo_springboot.mode.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUserInfo(){
        User user = new User();
        user.setUserName("zhansan");
        user.setUserAge(30);
        return user;
    }
}
