package per.wsk.dubbo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import per.wsk.bean.User;
import per.wsk.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService01;

    @Autowired
    private UserService userService02;

    @RequestMapping("/userDetail01")
    public String userDetail01(Model model,Integer id,String username){
        User user = userService01.queryUserByArgs(id, username);
        model.addAttribute("user",user);
        return "userDetail";
    }

    @RequestMapping("/userDetail02")
    public String userDetail02(Model model,Integer id,String username){
        User user = userService02.queryUserByArgs(id, username);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
