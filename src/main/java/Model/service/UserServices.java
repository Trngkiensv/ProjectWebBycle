package Model.service;

import Model.DAO.UserDao;
import Model.bean.User;

public class UserServices {
    private static UserServices instance;

    public static UserServices getInstance() {
        if (instance == null) instance = new UserServices();
        return instance;
    }


    public User checkLogin(String email, String password) {
        User userByEmail = UserDao.getUserByEmail(email);

        if (userByEmail != null && userByEmail.getEmail().equals(email)
                && userByEmail.getPassword().equals(password))
            return userByEmail;
        else return null;
    }

    public static void main(String[] args) {
        User u = getInstance().checkLogin("linh@gmail.com", "123");
        System.out.println(u.getEmail());
    }

}
