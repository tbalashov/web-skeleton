package tb.dao;

import tb.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    Map<String, User> users;

    public UserDao() {
        users = new HashMap<>();

        User user = new User();
        user.setLogin("user");
        user.setPassword("pass");

        users.put("user/pass", user);
    }

    public User findByCredentials(String login, String password) {
        //todo: use db instead map
        return users.get(login + "/" + password);
    }
}
