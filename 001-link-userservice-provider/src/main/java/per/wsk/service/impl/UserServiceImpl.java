package per.wsk.service.impl;

import per.wsk.bean.User;
import per.wsk.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User queryUserById(Integer id) {

        User user = new User();
        user.setId(1004);
        user.setUsername("岳不群");
        user.setAge(52);
        return user;
    }

}
