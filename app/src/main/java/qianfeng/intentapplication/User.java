package qianfeng.intentapplication;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/29 0029.
 */
public class User implements Serializable {

    private String password;
    private String userName;

    public User(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }


}
