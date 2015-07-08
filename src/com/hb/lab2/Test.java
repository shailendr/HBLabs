package com.hb.lab2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hb.lab1.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Customer.class);
		config.configure("/com/hb/config/hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Customer alex = new Customer();
		alex.setCustomerName("Alex");
		alex.setCustomerAddress("365 Bangalore, BC");
		alex.setCreditScore(429);
		alex.setRewardPoints(12000);
		
		session.save(alex);
		session.getTransaction().commit();
	}

}
