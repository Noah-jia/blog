package com.ellenjia.controller;


import com.ellenjia.common.Result;
import com.ellenjia.entity.MUser;
import com.ellenjia.service.MUserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author blog
 * @since 2021-04-15
 */
@RestController
@RequestMapping("/user")
public class MUserController {
    @Autowired
    private MUserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        MUser user = userService.getById(1L);
        return Result.success(200,"操作成功",user);
    }


    @PostMapping("/save")
    public Result save(@Validated @RequestBody  MUser user){
        return Result.success(user);
    }
}

