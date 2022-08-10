package per.wsk.service.impl;

import per.wsk.bean.User;
import per.wsk.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User queryUserByArgs(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }
}
