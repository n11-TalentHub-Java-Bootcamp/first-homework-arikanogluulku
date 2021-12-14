package entityService;

import dao.UserDao;
import entity.User;

import java.util.List;

public class UserEntityService {
    private UserDao userDao;

    public UserEntityService(){
        userDao = new UserDao();
    }
    public List<User> findAll(){
        return userDao.findAll();
    }
}
