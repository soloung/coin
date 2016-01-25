package com.chentiming.daoImp;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chentiming.entity.User;

@Transactional
@Service
public class UserDaoImp{
    @Autowired
    private SessionFactory sessionFactory;
    
    User user;
    
    String tableName;

    

    
    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    
    public User getById(Integer id) {
        return (User) getCurrentSession().get(User.class, id);
    }
    
}
