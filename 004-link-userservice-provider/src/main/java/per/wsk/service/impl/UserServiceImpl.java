package per.wsk.service.impl;

import per.wsk.bean.User;
import per.wsk.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("绿巨人");
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 57;
    }
}
