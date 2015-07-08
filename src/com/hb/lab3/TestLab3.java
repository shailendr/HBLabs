package com.hb.lab3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.hb.lab2.Customer;

public class TestLab3 {
	
	public static void main(String[] args){
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(School.class);
		config.configure("/com/hb/config/hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		SchoolDetails sd = new SchoolDetails();
		sd.setPublicSchool(true);
		sd.setSchoolAddress("94 gc road Bangalore");
		sd.setStudentCount(362);
		
		School sc =new School();
		sc.setSchoolDetails(sd);
		sc.setSchoolName("Bishop Cotton Girls School");
		
		session.save(sc);
		session.getTransaction().commit();
	}

}
