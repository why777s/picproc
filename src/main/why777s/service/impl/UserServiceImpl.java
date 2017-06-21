package service.impl;

import dao.impl.UserDaoImpl;
import entity.User;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

/**
 * Created by why777s on 2017/6/18.
 */
public class UserServiceImpl implements UserService{
    private UserDaoImpl userDao;

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public boolean login(User user) {
        try{
            User target_user = userDao.get(User.class,user.getUid());
            return user.getUserpwd().equals(target_user.getUserpwd());
        }catch (NullPointerException e){
            e.printStackTrace();
            return false;
        }
    }

    @Transactional
    public User get(String uid) {
        return userDao.get(User.class,uid);
    }
}
