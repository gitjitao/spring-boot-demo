package com.b2b.crm.web.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.b2b.crm.annotation.Authenticated;
import com.b2b.crm.model.User;
import com.b2b.crm.service.UserService;

@Controller
@Authenticated
@RequestMapping("/user")
public class IndexController extends BaseController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String find(Model model) {
        List<User> userList = userService.listAllUser();
        model.addAttribute("userList" , userList);
        return "index";
    }

}
