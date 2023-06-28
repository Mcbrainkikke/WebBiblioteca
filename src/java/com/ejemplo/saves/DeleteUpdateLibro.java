package com.ejemplo.saves;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.ejemplo.entidades.Libro;

public class DeleteUpdateLibro {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Libro.class)
				.buildSessionFactory();
		
		Session session =  factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			//----metodo para actualizar----
			Libro per = session.get(Libro.class, "12-3456-789");
			per.setTitulo("HP y la piedra filosofal");
			
			//metodo para actualizar por comando SQL
			//session.createQuery("update Libro l set l.titulo = 'HP y la piedra filosofal' where l.nombre = 'Harry Potter' ").executeUpdate();
			
			
			//----metodo para eliminar----
			//session.delete(per);
			
			//metodo para eliminar por comando SQL
			//session.createQuery("delete from Libro l where l.titulo = 'HP y la piedra filosofal' ").executeUpdate();
			
			
			session.getTransaction().commit();
			
			System.out.println("Proceso Finalizado");
			
		}finally {
			factory.close();
		}

	}

	

}
