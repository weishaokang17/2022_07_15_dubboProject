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

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model, Integer id) {

        //根据用户标识获取用户详情
        User user = userService.queryUserById(id);

        //获取用户总人数
        Integer allUserCount = userService.queryAllUserCount();

        model.addAttribute("user",user);
        model.addAttribute("allUserCount",allUserCount);

        return "userDetail";
    }

}
