package com.ejemplo.saves;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.ejemplo.entidades.Libro;

public class ReadLibro {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Libro.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Libro libros = session.get(Libro.class, "12-3456-789");
			System.out.println("Registro Obtenido!: " + libros);	
			
			List<Libro> libro = session.createQuery("from Libro").list();
			System.out.println("\nConsulta General");
			for(Libro l: libro) {
				System.out.println(l);
			}
			
			session.getTransaction().commit();
			
			System.out.println("Proceso Finalizado");
			
		}finally {
			factory.close();
		}

	}

}
