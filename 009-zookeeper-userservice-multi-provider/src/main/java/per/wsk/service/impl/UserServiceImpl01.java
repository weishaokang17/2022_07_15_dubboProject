package per.wsk.service.impl;

import per.wsk.bean.User;
import per.wsk.service.UserService;

public class UserServiceImpl01 implements UserService {

    @Override
    public User queryUserByArgs(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username + " -01");
        return user;
    }
}
