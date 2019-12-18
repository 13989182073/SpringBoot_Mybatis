package com.luck.demo.controller;

import com.luck.demo.entity.user;
import com.luck.demo.service.UserServices;
import com.luck.demo.utils.CommonResult;
import com.luck.demo.utils.userUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Api(tags = "userController", description = "关于用户的controller")
@Controller
public class userController {
    @Autowired
    private UserServices userServices;
    @Autowired
    private userUtils userUtils;


    /**
     * @Description: 登录成功跳转到主页面
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/11
     */
    @ApiOperation("登录成功跳转到主页面")
    @RequestMapping("/index")
    public ModelAndView Index(HttpSession session) {
        ModelAndView mv = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //主体名，即登录用户名
        mv.addObject("username", name);
        mv.setViewName("index");
        return mv;

    }

    @ApiOperation("不登录跳转到主界面")
    @RequestMapping("/")
    public ModelAndView unLogin(HttpSession session) {
        ModelAndView mv = new ModelAndView();
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        String name = auth.getName(); //主体名，即登录用户名
//        mv.addObject("username", name);
        mv.setViewName("index");
        return mv;

    }


    /**
     * @Description: 跳转到登录界面
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/11
     */
    @ApiOperation("跳转到登录界面")
    @RequestMapping("/login")
    public String login() {

        return "login";

    }


    /**
     * @Description: 跳转到注册界面
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/16
     */
    @ApiOperation("跳转到注册界面")
    @RequestMapping("/register")
    public String register() {

        return "register";
    }


    /**
     * @Description: 跳转到member-list
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/16
     */
    @ApiOperation("跳转到member-list")
    @RequestMapping("/member-list")
    public String memberlist() {

        return "member-list";
    }

    /**
     * @Description: 跳转到member-list1
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/16
     *
     */
    @ApiOperation("跳转到member-list1")
    @RequestMapping("/member-list1")
    public String memberlist1() {

        return "member-list1";
    }


    /**
     * @Description: 用户注册逻辑
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/16
     */
    @ApiOperation("用户注册")
    @RequestMapping("/userRegister")
    public ModelAndView userRegister(user user) throws Exception {
        ModelAndView mv = new ModelAndView();
        try {
            Integer i = userServices.userRegister(user);
            if (i == 1) {
                mv.setViewName("login");
            } else {
                mv.setViewName("register");
            }
        } catch (Exception e) {
            mv.setViewName("register");
        }


        return mv;


    }

    /**
     * @Description: 根据输入的用户名判断用户是否已存在
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/16
     */
    @ApiOperation("根据输入的用户名判断用户是否已存在")
    @ResponseBody
    @PostMapping("/checkUsername")
    public CommonResult<String> checkUsername(@RequestParam("username") String username) {

        user user = userServices.checkUsername(username);
        if (user == null) {
            return CommonResult.success("用户不存在，可以注册");
        } else {
            return CommonResult.failed("用户已存在");
        }

    }


    /**
     * @Description: 跳转到登录失败界面
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/13
     */
    @ApiOperation("跳转到登录失败界面")
    @RequestMapping("/login-error")
    public ModelAndView loginerror() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("loginStatus", true);
        mv.setViewName("login");
        return mv;

    }


    /**
     * @Description: 跳转到欢迎界面
     * @Param:
     * @return:
     * @Author: bo.yan
     * @date: 2019/12/13
     */
    @ApiOperation("跳转到欢迎界面")
    @RequestMapping("/welcome")
    public ModelAndView welcome() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        return mv;

    }
//
//    /**
//     * @Description: 登录逻辑
//     * @Param:
//     * @return:
//     * @Author: bo.yan
//     * @date: 2019/12/11
//     */
//
//    @RequestMapping("/loginByUser")
//    public String loginByUser(user user) {
//
//        int i = userServices.login(user);
//        if (i == 1) {
//            return "index";
//        } else {
//
//            return "login";
//        }
//
//
//    }
}
