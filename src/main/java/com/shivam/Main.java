package com.shivam;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        a1.setName("rahul");
        a1.setId(9);
        a1.setPoint(89);

    //Hey hibernate save with a1 object

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.shivam.Alien.class);
//        config.configure("hibernate.cfg.xml");


        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.shivam.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session =factory.openSession();


        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        transaction.commit();
        session.close();
        factory.close();

    }


}