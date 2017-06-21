package controller;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import service.UserService;

/**
 * Created by why777s on 2017/6/18.
 */
public class LoginAction extends ActionSupport{
    private UserService userService;
    private String uid;
    private String userpwd;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String login() throws Exception {
        try {
            int uuid = Integer.parseInt(getUid());

            User user = new User();
            user.setUid(uuid);
            user.setUserpwd(getUserpwd());
            if (userService.login(user))
                return SUCCESS;
            else
                return ERROR;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return ERROR;
        }


    }
}
