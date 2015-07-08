package com.hb.lab1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Test {

	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Employee.class);
		config.configure("/com/hb/config/hibernate.cfg.xml");
		
		//new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
			
		{
			Employee emp = new Employee();
			emp.setEmpName("Dev1 Singh");
			emp.setEmpEmailAddress("Dev1@gmail.com");
			session.save(emp);
		}
		{
			Employee emp = new Employee();
			emp.setEmpName("Dev2 Singh");
			emp.setEmpEmailAddress("Dev2@gmail.com");
			session.save(emp);
		}
		{
			Employee emp = new Employee();
			emp.setEmpName("Dev3 Singh");
			emp.setEmpEmailAddress("Dev3@gmail.com");
			session.save(emp);
		}

		session.getTransaction().commit();
	}

}
