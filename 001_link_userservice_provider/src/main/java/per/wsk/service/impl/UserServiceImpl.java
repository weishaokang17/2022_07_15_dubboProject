package per.wsk.service.impl;

import per.wsk.bean.User;
import per.wsk.service.UserService;

public class UserServiceImpl implements UserService {


    @Override
    public User queryUserById(Integer id) {

        User user = new User(1001, "岳不群", 52);

        return user;
    }
}
