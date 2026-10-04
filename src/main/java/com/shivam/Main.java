package com.shivam;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        a1.setName("jamuna");
        a1.setId(1);
        a1.setPoint(91);

    //Hey hibernate save with a1 object

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.shivam.Alien.class);
//        config.configure("hibernate.cfg.xml");


        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.shivam.Alien.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session =factory.openSession();

        //using to insert the data
//        Transaction transaction = session.beginTransaction(); //No need in fetching but inserting
//        session.persist(a1);
//        transaction.commit();

        //For fetching the data
//        Alien a2 = session.find(Alien.class, 6);
//        System.out.println(a2);

        //Updating the data
//        Transaction transaction = session.beginTransaction();
//        session.merge(a1); //if object is present it update it otherwise make one
//        transaction.commit();

        //Deleting the data
        Transaction tx = session.beginTransaction();
        Alien a2 = session.find(Alien.class,7);
        session.remove(a2); //It needs object which we want to remove
        tx.commit();


        session.close();
        factory.close();

    }


}