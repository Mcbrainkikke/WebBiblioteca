package com.ejemplo.saves;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.ejemplo.entidades.Editorial;

public class SaveEditorial {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Editorial.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			//----metodo para agregar----
			Editorial editorial = new Editorial("3-2222-1111","Santillana","555-4444","avenida siempreviva 123",
												"santillana@correo.com","www.st.com.co");
			session.save(editorial);
			
			session.getTransaction().commit();
			
			System.out.println("Registro almacenado!");
			
		}finally {
			factory.close();
		}
	}

}
