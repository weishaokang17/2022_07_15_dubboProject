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
    private UserService userService;


    @RequestMapping("/userDetail")
    public String userDetail(Model model, Integer id, String username){
        User user = userService.queryUserByArgs(id, username);
        model.addAttribute("user",user);
        return "userDetail";
    }


}
