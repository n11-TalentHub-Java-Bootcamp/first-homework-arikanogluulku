package dao;

import base.BaseDao;
import entity.User;
import org.hibernate.query.Query;

import java.util.List;

public class UserDao extends BaseDao {
    public List<User> findAll(){
        Query query = getCurrentSession().createQuery(" SELECT user FROM User user ");
        return query.list();
    }

}
