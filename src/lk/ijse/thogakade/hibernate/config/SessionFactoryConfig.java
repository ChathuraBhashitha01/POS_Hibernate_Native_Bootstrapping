package lk.ijse.thogakade.hibernate.config;

import lk.ijse.thogakade.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {
    private static SessionFactoryConfig sessionFactoryConfig;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig(){
        sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

    }
    public static SessionFactoryConfig getInstance(){
        return (null ==sessionFactoryConfig)?sessionFactoryConfig=new SessionFactoryConfig()
                : sessionFactoryConfig;
    }
    public Session getSession(){
        return sessionFactory.openSession();

    }
}
