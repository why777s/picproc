package service;

import entity.User;

/**
 * Created by why777s on 2017/6/18.
 */
public interface UserService {
    // 用户登录验证
    boolean login(User user);

    User get(String uid);
}
