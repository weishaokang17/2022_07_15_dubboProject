package per.wsk.service;

import per.wsk.bean.User;

public interface UserService {

    /**
     * 根据id查用户
     * @param id
     * @return
     */
    User queryUserById(Integer id);

}
