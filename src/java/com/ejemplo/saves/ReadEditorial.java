package com.ejemplo.saves;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.ejemplo.entidades.Editorial;

public class ReadEditorial {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Editorial.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Editorial resultado = session.get(Editorial.class, "1-2222-8888");
			System.out.println("Registro Obtenido!: " + resultado);			
			
			List<Editorial> resultados = session.createQuery("from Editorial").list();
			System.out.println("\nConsulta General");
			for(Editorial e: resultados) {
				System.out.println(e);
			}
			
			session.getTransaction().commit();
			
			System.out.println("Proceso Finalizado");
			
		}finally {
			factory.close();
		}
	}

}
