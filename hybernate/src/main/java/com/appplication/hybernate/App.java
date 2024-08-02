package com.appplication.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;


public class App 
{
    @SuppressWarnings({ "deprecation"})
	public static void main( String[] args )
    {
//        Configuration conn = new Configuration().configure("hibernate.cfg.xml");   //connection started
//        
//        SessionFactory sf = conn.buildSessionFactory();  //build database
//        
//        Session s = sf.openSession();   //database open
//        
//        s.beginTransaction();    //tables creation
//        
//        s.save(s);   //inserts the data
//        
//        s.getTransaction().commit();
//    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
    	
    	StandardServiceRegistry str = new StandardServiceRegistryBuilder().configure().build();
    	
    	Metadata mt = new MetadataSources(str).getMetadataBuilder().build();
    	
    	
    	SessionFactory sf = mt.buildSessionFactory();
    	
    	Session s = sf.openSession();
    	
    	Transaction t = s.beginTransaction();
    	
        hibernate hb = new hibernate();         
        hb.setName("sravanthi");
        hb.setEmail("sravanthi@gmail.com");
        hb.setPassword("chinnu");
        hb.setPhoneno(901454076);
        
    	s.save(hb);
    	
    	t.commit();  //printing
    	System.out.println("successfully inserted");
    	
    	sf.close();
    	
    	s.close();  	
    	
    }
}
