package org.example.service;

import org.example.model.User;
import org.example.utils.FileUtils;

import java.util.List;

public class LoginServiceService implements ILoginService {
    private IUserService iUserService;
    @Override
    public void createUser(User user) {
        List<User> users = iUserService.getAllUsers();
        user.setId(users.size() + 1);
        users.add(user);

        FileUtils.writeData(fileUser, users);
    }

    @Override
    public boolean checkLogin(String userName, String passWord) {
        return false;
    }
}
