package com.example.demo.controller;

import com.example.demo.mapper.AdmMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private AdmMapper mapper;

    @RequestMapping(value = "/login",method=RequestMethod.POST)
    public String login(@RequestParam("account") String account,@RequestParam("pwd") String pwd){
        List<User> users = mapper.getUserList();
        System.out.println(users);
        Map<String,String> userMap = new HashMap<>();
        for (User user:users) {
            userMap.put(user.getAccount(),user.getPwd());
        }

        if (!userMap.containsKey(account)){
            return "用户不存在！";
        }else if(!userMap.get(account).equals(pwd)){
            return "密码有误！";
        }else{
            return "登录成功";
        }
    }
}
