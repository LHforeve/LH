package com.example.restful;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping("")
    public String adduser(@RequestBody User user){
        System.out.println("新增用户信息："+ user);
        return "新增用户信息成功";
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        System.out.println("删除用户id"+id);
        return "删除用户id成功";
    }
    @PutMapping("")
    public String updateUser(@RequestBody User user){
        System.out.println("修改后用户信息" + user);
        return "修改用户成功";
    }
    @GetMapping("/{id}")
    public String getUser(@PathVariable int id){
        System.out.println("查找用户信息id");
        return "查找成功";
    }
    @GetMapping("")
    public String getUser(){
        System.out.println("查找所有用户");
        return "查找所有用户成功";
    }
}
