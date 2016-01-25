package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.chentm.dao.entity.User;

public class Test {
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
    
    public static void main(String args[]){
    	Test test = new Test();
    	test.getById(1);
    }
}
