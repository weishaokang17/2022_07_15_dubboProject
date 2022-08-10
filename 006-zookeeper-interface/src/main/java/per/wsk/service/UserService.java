package per.wsk.service;

import per.wsk.bean.User;

public interface UserService {

    /**
     * 根据用户标识获取用户的信息
     * @param id
     * @param username
     * @return
     */
    User queryUserByArgs(Integer id, String username);
}
