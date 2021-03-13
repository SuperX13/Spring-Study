package service;

import dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    //    利用SET实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
