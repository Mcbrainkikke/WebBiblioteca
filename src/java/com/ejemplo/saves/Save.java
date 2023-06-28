package com.ejemplo.saves;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.sql.ordering.antlr.Factory;

import com.ejemplo.entidades.Categorias;



public class Save {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Categorias.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Categorias categoria = new Categorias("Prueba_dos");
			session.save(categoria);
			
			session.getTransaction().commit();
			
			System.out.println("Registro almacenado!");
			
		}finally {
			factory.close();
		}

	}

}
