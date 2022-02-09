package top.sceve.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import top.sceve.entity.User;
import top.sceve.service.impl.UserServiceImpl;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LeeSen
 * @since 2022-02-09
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping
    public User select(){
        User byId = userService.getById(1);
        System.out.println(byId);
        return byId;
    }



}
