package com.ejemplo.saves;

import java.time.LocalDate;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.ejemplo.entidades.Libro;

public class SaveLibro {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Libro.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Libro libro = new Libro("12-3456-789", "Harry Potter", "descripcion", "JK Rowling",
                    Date.valueOf(LocalDate.of(1, 1, 1)), Date.valueOf(LocalDate.now()), 1, "1-2222-8888");
			session.save(libro);
			
			session.getTransaction().commit();
			
			System.out.println("Registro almacenado!");
			
		}finally {
			factory.close();
		}

	}

}
